package typingsSlinky.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushFilter extends StObject {
  
  /** Regexes matching branches to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax */
  var branch: js.UndefOr[String] = js.native
  
  /** When true, only trigger a build if the revision regex does NOT match the git_ref regex. */
  var invertRegex: js.UndefOr[Boolean] = js.native
  
  /** Regexes matching tags to build. The syntax of the regular expressions accepted is the syntax accepted by RE2 and described at https://github.com/google/re2/wiki/Syntax */
  var tag: js.UndefOr[String] = js.native
}
object PushFilter {
  
  @scala.inline
  def apply(): PushFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PushFilter]
  }
  
  @scala.inline
  implicit class PushFilterMutableBuilder[Self <: PushFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
    
    @scala.inline
    def setInvertRegex(value: Boolean): Self = StObject.set(x, "invertRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertRegexUndefined: Self = StObject.set(x, "invertRegex", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
