package typingsSlinky.fluentuiReactIcons.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SvgIconFuncWithRootArg[TProps] extends js.Object {
  var classes: StringDictionary[String]
  var processedRootProps: HTMLAttributes[HTMLElement]
  var props: TProps
}

object SvgIconFuncWithRootArg {
  @scala.inline
  def apply[TProps](classes: StringDictionary[String], processedRootProps: HTMLAttributes[HTMLElement], props: TProps): SvgIconFuncWithRootArg[TProps] = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], processedRootProps = processedRootProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvgIconFuncWithRootArg[TProps]]
  }
}

