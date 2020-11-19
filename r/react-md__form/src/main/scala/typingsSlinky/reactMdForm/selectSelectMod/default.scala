package typingsSlinky.reactMdForm.selectSelectMod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This component is an accessible version of the `<select>` element that allows
  * for some more custom styles by using the `@react-md/list` package to render
  * the list of options.
  *
  * The `Select` component **must be controlled** with a `value` and `onChange`
  * handler.
  *
  * Note: Since this is not a native `<select>` component, the current value will
  * be rendered in an `<input type="hidden" />` element so that the value can be
  * sent along in forms. It is highly recommended to always provide a `name` prop
  * so this value is sent.
  */
@JSImport("@react-md/form/types/select/Select", JSImport.Default)
@js.native
object default extends TopLevel[ForwardRefExoticComponent[SelectProps with RefAttributes[HTMLDivElement]]]
