package typingsSlinky.jupyterlabCoreutils.urlMod.URLExt

import typingsSlinky.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/coreutils/lib/url", "URLExt.objectToQueryString")
@js.native
object objectToQueryString extends js.Object {
  
  /**
    * Return a serialized object string suitable for a query.
    *
    * @param object - The source object.
    *
    * @returns an encoded url query.
    *
    * #### Notes
    * Modified version of [stackoverflow](http://stackoverflow.com/a/30707423).
    */
  def apply(value: PartialJSONObject): String = js.native
}
