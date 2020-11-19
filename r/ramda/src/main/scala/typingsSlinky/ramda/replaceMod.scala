package typingsSlinky.ramda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ramda/src/replace", JSImport.Namespace)
@js.native
object replaceMod extends js.Object {
  
  def default(pattern: String): js.Function1[
    /* replacement */ String | (js.Function2[/* match */ String, /* repeated */ js.Any, String]), 
    js.Function1[/* str */ String, String]
  ] = js.native
  def default(pattern: String, replacement: String): js.Function1[/* str */ String, String] = js.native
  def default(pattern: String, replacement: String, str: String): String = js.native
  def default(pattern: String, replacement: js.Function2[/* match */ String, /* repeated */ js.Any, String]): js.Function1[/* str */ String, String] = js.native
  def default(
    pattern: String,
    replacement: js.Function2[/* match */ String, /* repeated */ js.Any, String],
    str: String
  ): String = js.native
  def default(pattern: js.RegExp): js.Function1[
    /* replacement */ String | (js.Function2[/* match */ String, /* repeated */ js.Any, String]), 
    js.Function1[/* str */ String, String]
  ] = js.native
  def default(pattern: js.RegExp, replacement: String): js.Function1[/* str */ String, String] = js.native
  def default(pattern: js.RegExp, replacement: String, str: String): String = js.native
  def default(pattern: js.RegExp, replacement: js.Function2[/* match */ String, /* repeated */ js.Any, String]): js.Function1[/* str */ String, String] = js.native
  def default(
    pattern: js.RegExp,
    replacement: js.Function2[/* match */ String, /* repeated */ js.Any, String],
    str: String
  ): String = js.native
}
