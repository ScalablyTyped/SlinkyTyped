package typingsSlinky.ejs.mod

import typingsSlinky.ejs.Optionsasyncfalseclientfa
import typingsSlinky.ejs.Optionsasyncfalseclienttr
import typingsSlinky.ejs.Optionsasynctrueclientfal
import typingsSlinky.ejs.Optionsasynctrueclienttru
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ejs", "compile")
@js.native
object compile extends js.Object {
  def apply(template: String): TemplateFunction | AsyncTemplateFunction = js.native
  def apply(template: String, opts: Optionsasyncfalseclientfa): TemplateFunction = js.native
  def apply(template: String, opts: Optionsasyncfalseclienttr): ClientFunction = js.native
  def apply(template: String, opts: Optionsasynctrueclientfal): AsyncTemplateFunction = js.native
  def apply(template: String, opts: Optionsasynctrueclienttru): AsyncClientFunction = js.native
  def apply(template: String, opts: Options): TemplateFunction | AsyncTemplateFunction = js.native
}

