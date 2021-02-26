package typingsSlinky.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UrlMaps A host-matching rule for a URL. If matched, will use the named
  * PathMatcher to select the BackendService.
  */
@js.native
trait SchemaHostRule extends StObject {
  
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The list of host patterns to match. They must be valid hostnames, except
    * * will match any string of ([a-z0-9-.]*). In that case, * must be the
    * first character and must be followed in the pattern by either - or ..
    */
  var hosts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The name of the PathMatcher to use to match the path portion of the URL
    * if the hostRule matches the URL&#39;s host portion.
    */
  var pathMatcher: js.UndefOr[String] = js.native
}
object SchemaHostRule {
  
  @scala.inline
  def apply(): SchemaHostRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHostRule]
  }
  
  @scala.inline
  implicit class SchemaHostRuleMutableBuilder[Self <: SchemaHostRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setHosts(value: js.Array[String]): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    @scala.inline
    def setHostsVarargs(value: String*): Self = StObject.set(x, "hosts", js.Array(value :_*))
    
    @scala.inline
    def setPathMatcher(value: String): Self = StObject.set(x, "pathMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathMatcherUndefined: Self = StObject.set(x, "pathMatcher", js.undefined)
  }
}
