package typingsSlinky.purl

import typingsSlinky.purl.mod.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  /**
    * Parse the current page URL 
    */
  def url(): Url = js.native
  /** 
    * Pass in a URI as a string and parse that 
    * 
    * @param someUrl the url to be parsed
    */
  def url(someUrl: String): Url = js.native
}
