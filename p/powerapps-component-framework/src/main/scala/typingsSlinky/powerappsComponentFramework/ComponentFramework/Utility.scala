package typingsSlinky.powerappsComponentFramework.ComponentFramework

import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.EntityMetadata
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.PrivilegeDepth
import typingsSlinky.powerappsComponentFramework.ComponentFramework.PropertyHelper.Types.PrivilegeType
import typingsSlinky.powerappsComponentFramework.ComponentFramework.UtilityApi.LookupOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for context.utils
  */
@js.native
trait Utility extends StObject {
  
  /**
    * Gets the entity metadata for the specified entity.
    * @param entityType The logical name of the entity.
    * @param attributes The attributes to get metadata for.
    */
  def getEntityMetadata(entityName: String): js.Promise[EntityMetadata] = js.native
  def getEntityMetadata(entityName: String, attributes: js.Array[String]): js.Promise[EntityMetadata] = js.native
  
  /**
    * Function to return if the user has Privilege for one specific entity
    * @entityTypeName entity type name
    * @privilegeType privilege type i.e. Create, Read, Write etc.
    * @privilegeDepth privilege depth i.e. basic, Global etc.
    */
  def hasEntityPrivilege(entityTypeName: String, privilegeType: PrivilegeType, privilegeDepth: PrivilegeDepth): Boolean = js.native
  
  /**
    * Opens a lookup dialog allowing the user to select one or more entities.
    * @param lookupOptions Options for opening the lookup dialog.
    */
  def lookupObjects(lookupOptions: LookupOptions): js.Promise[js.Array[EntityReference]] = js.native
}
