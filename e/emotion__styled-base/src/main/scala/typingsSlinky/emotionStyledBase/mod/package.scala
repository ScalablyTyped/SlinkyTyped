package typingsSlinky.emotionStyledBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CreateStyledComponentExtrinsic[Tag /* <: slinky.core.ReactComponentClass[_] */, ExtraProps, Theme /* <: js.Object */] = typingsSlinky.emotionStyledBase.mod.CreateStyledComponentBase[typingsSlinky.emotionStyledBase.helperMod.PropsOf[Tag], ExtraProps, Theme]
  type CreateStyledComponentIntrinsic[Tag /* <: java.lang.String */, ExtraProps, Theme /* <: js.Object */] = typingsSlinky.emotionStyledBase.mod.CreateStyledComponentBase[
    /* import warning: importer.ImportType#apply Failed type conversion: @emotion/styled-base.@emotion/styled-base.JSXInEl[Tag] */ js.Any, 
    ExtraProps, 
    Theme
  ]
  type JSXInEl = typingsSlinky.react.mod._Global_.JSX.IntrinsicElements
  type ReactClassPropKeys = java.lang.String
  type WithTheme[P, T] = (P with typingsSlinky.emotionStyledBase.AnonThemeT[T]) | (P with typingsSlinky.emotionStyledBase.AnonThemeExclude)
}
