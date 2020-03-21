package typingsSlinky.htmlWebpackPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** @deprecated use Options */
  type Config = typingsSlinky.htmlWebpackPlugin.mod.Options
  /** @deprecated use MinifyOptions */
  type MinifyConfig = typingsSlinky.htmlWebpackPlugin.mod.MinifyOptions
  type MinifyOptions = typingsSlinky.htmlMinifier.mod.Options
  type TemplateFunction = js.Function1[/* param */ js.Object, java.lang.String]
}
