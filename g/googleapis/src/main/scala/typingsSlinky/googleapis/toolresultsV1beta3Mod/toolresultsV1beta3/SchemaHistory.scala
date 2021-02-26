package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A History represents a sorted list of Executions ordered by the
  * start_timestamp_millis field (descending). It can be used to group all the
  * Executions of a continuous build.  Note that the ordering only operates on
  * one-dimension. If a repository has multiple branches, it means that
  * multiple histories will need to be used in order to order Executions per
  * branch.
  */
@js.native
trait SchemaHistory extends StObject {
  
  /**
    * A short human-readable (plain text) name to display in the UI. Maximum of
    * 100 characters.  - In response: present if set during create. - In create
    * request: optional
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier within a project for this History.  Returns
    * INVALID_ARGUMENT if this field is set or overwritten by the caller.  - In
    * response always set - In create request: never set
    */
  var historyId: js.UndefOr[String] = js.native
  
  /**
    * A name to uniquely identify a history within a project. Maximum of 200
    * characters.  - In response always set - In create request: always set
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaHistory {
  
  @scala.inline
  def apply(): SchemaHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistory]
  }
  
  @scala.inline
  implicit class SchemaHistoryMutableBuilder[Self <: SchemaHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
