package typingsSlinky.ariaQuery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ariaQuery.mod.ARIAWidgetRole
    - typingsSlinky.ariaQuery.mod.ARIACompositeWidgetRole
    - typingsSlinky.ariaQuery.mod.ARIADocumentStructureRole
    - typingsSlinky.ariaQuery.mod.ARIALandmarkRole
    - typingsSlinky.ariaQuery.mod.ARIALiveRegionRole
    - typingsSlinky.ariaQuery.mod.ARIAWindowRole
    - typingsSlinky.ariaQuery.mod.ARIAUncategorizedRole
  */
  type ARIARole = typingsSlinky.ariaQuery.mod._ARIARole | typingsSlinky.ariaQuery.mod.ARIAUncategorizedRole
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.ariaQuery.mod.ARIAAbstractRole
    - typingsSlinky.ariaQuery.mod.ARIARole
    - typingsSlinky.ariaQuery.mod.ARIADPubRole
  */
  type ARIARoleDefintionKey = typingsSlinky.ariaQuery.mod._ARIARoleDefintionKey | typingsSlinky.ariaQuery.mod.ARIAUncategorizedRole
  
  type ARIAUncategorizedRole = typingsSlinky.ariaQuery.ariaQueryStrings.code
  
  @scala.inline
  def aria: typingsSlinky.std.Map[
    typingsSlinky.ariaQuery.mod.ARIAProperty, 
    typingsSlinky.ariaQuery.mod.ARIAPropertyDefinition
  ] = typingsSlinky.ariaQuery.mod.^.asInstanceOf[js.Dynamic].selectDynamic("aria").asInstanceOf[typingsSlinky.std.Map[
    typingsSlinky.ariaQuery.mod.ARIAProperty, 
    typingsSlinky.ariaQuery.mod.ARIAPropertyDefinition
  ]]
  
  @scala.inline
  def dom: typingsSlinky.std.Map[java.lang.String, typingsSlinky.ariaQuery.mod.DOMDefinition] = typingsSlinky.ariaQuery.mod.^.asInstanceOf[js.Dynamic].selectDynamic("dom").asInstanceOf[typingsSlinky.std.Map[java.lang.String, typingsSlinky.ariaQuery.mod.DOMDefinition]]
  
  @scala.inline
  def elementRoles: typingsSlinky.std.Map[
    typingsSlinky.ariaQuery.mod.ARIARoleRelationConcept, 
    typingsSlinky.std.Set[typingsSlinky.ariaQuery.mod.ARIARoleDefintionKey]
  ] = typingsSlinky.ariaQuery.mod.^.asInstanceOf[js.Dynamic].selectDynamic("elementRoles").asInstanceOf[typingsSlinky.std.Map[
    typingsSlinky.ariaQuery.mod.ARIARoleRelationConcept, 
    typingsSlinky.std.Set[typingsSlinky.ariaQuery.mod.ARIARoleDefintionKey]
  ]]
  
  @scala.inline
  def roleElements: typingsSlinky.std.Map[
    typingsSlinky.ariaQuery.mod.ARIARoleDefintionKey, 
    typingsSlinky.std.Set[typingsSlinky.ariaQuery.mod.ARIARoleRelationConcept]
  ] = typingsSlinky.ariaQuery.mod.^.asInstanceOf[js.Dynamic].selectDynamic("roleElements").asInstanceOf[typingsSlinky.std.Map[
    typingsSlinky.ariaQuery.mod.ARIARoleDefintionKey, 
    typingsSlinky.std.Set[typingsSlinky.ariaQuery.mod.ARIARoleRelationConcept]
  ]]
  
  @scala.inline
  def roles: typingsSlinky.std.Map[
    typingsSlinky.ariaQuery.mod.ARIARoleDefintionKey, 
    typingsSlinky.ariaQuery.mod.ARIARoleDefinition
  ] = typingsSlinky.ariaQuery.mod.^.asInstanceOf[js.Dynamic].selectDynamic("roles").asInstanceOf[typingsSlinky.std.Map[
    typingsSlinky.ariaQuery.mod.ARIARoleDefintionKey, 
    typingsSlinky.ariaQuery.mod.ARIARoleDefinition
  ]]
}
