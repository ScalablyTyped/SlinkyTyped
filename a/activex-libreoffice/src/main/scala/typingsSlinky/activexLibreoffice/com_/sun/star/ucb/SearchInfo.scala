package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** information needed to (recursively) search an object. */
@js.native
trait SearchInfo extends StObject {
  
  /** the search criteria. */
  var Criteria: SafeArray[SearchCriterium] = js.native
  
  /** whether to follow indirections (link objects) and search through their respective targets also. */
  var FollowIndirections: Boolean = js.native
  
  /** whether to include the object itself in the search or only (some of) its sub-objects. */
  var IncludeBase: Boolean = js.native
  
  /** the mode of recursion to use. */
  var Recursion: SearchRecursion = js.native
  
  /**
    * whether to respect the "view restrictions" specified for the documents hierarchically contained within an object (e.g., only searches through marked
    * documents).
    */
  var RespectDocViewRestrictions: Boolean = js.native
  
  /**
    * whether to respect the "view restrictions" specified for the folders hierarchically contained within an object (e.g., only searches through subscribed
    * folders).
    */
  var RespectFolderViewRestrictions: Boolean = js.native
}
object SearchInfo {
  
  @scala.inline
  def apply(
    Criteria: SafeArray[SearchCriterium],
    FollowIndirections: Boolean,
    IncludeBase: Boolean,
    Recursion: SearchRecursion,
    RespectDocViewRestrictions: Boolean,
    RespectFolderViewRestrictions: Boolean
  ): SearchInfo = {
    val __obj = js.Dynamic.literal(Criteria = Criteria.asInstanceOf[js.Any], FollowIndirections = FollowIndirections.asInstanceOf[js.Any], IncludeBase = IncludeBase.asInstanceOf[js.Any], Recursion = Recursion.asInstanceOf[js.Any], RespectDocViewRestrictions = RespectDocViewRestrictions.asInstanceOf[js.Any], RespectFolderViewRestrictions = RespectFolderViewRestrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchInfo]
  }
  
  @scala.inline
  implicit class SearchInfoMutableBuilder[Self <: SearchInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCriteria(value: SafeArray[SearchCriterium]): Self = StObject.set(x, "Criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowIndirections(value: Boolean): Self = StObject.set(x, "FollowIndirections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeBase(value: Boolean): Self = StObject.set(x, "IncludeBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursion(value: SearchRecursion): Self = StObject.set(x, "Recursion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespectDocViewRestrictions(value: Boolean): Self = StObject.set(x, "RespectDocViewRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRespectFolderViewRestrictions(value: Boolean): Self = StObject.set(x, "RespectFolderViewRestrictions", value.asInstanceOf[js.Any])
  }
}
