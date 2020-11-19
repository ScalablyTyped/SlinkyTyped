package typingsSlinky.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief url 处理模块
  * @detail 
  */
@JSImport("url", JSImport.Namespace)
@js.native
object urlMod extends js.Object {
  
  def format(args: js.Object): String = js.native
  
  def parse(url: String): ClassUrlObject = js.native
  def parse(url: String, parseQueryString: js.UndefOr[scala.Nothing], slashesDenoteHost: Boolean): ClassUrlObject = js.native
  def parse(url: String, parseQueryString: Boolean): ClassUrlObject = js.native
  def parse(url: String, parseQueryString: Boolean, slashesDenoteHost: Boolean): ClassUrlObject = js.native
}
