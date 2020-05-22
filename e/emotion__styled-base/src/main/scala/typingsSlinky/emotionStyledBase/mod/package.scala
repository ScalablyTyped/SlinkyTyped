package typingsSlinky.emotionStyledBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CreateStyledComponentExtrinsic[Tag /* <: slinky.core.ReactComponentClass[_] */, ExtraProps, Theme /* <: js.Object */] = typingsSlinky.emotionStyledBase.mod.CreateStyledComponentBase[typingsSlinky.emotionStyledBase.helperMod.PropsOf[Tag], ExtraProps, Theme]
  type CreateStyledComponentIntrinsic[Tag /* <: /* keyof @emotion/styled-base.@emotion/styled-base.JSXInEl */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */, ExtraProps, Theme /* <: js.Object */] = typingsSlinky.emotionStyledBase.mod.CreateStyledComponentBase[
    /* import warning: importer.ImportType#apply Failed type conversion: @emotion/styled-base.@emotion/styled-base.JSXInEl[Tag] */ js.Any, 
    ExtraProps, 
    Theme
  ]
  type JSXInEl = typingsSlinky.react.mod.global.JSX.IntrinsicElements
  type WithTheme[P, T] = (P with typingsSlinky.emotionStyledBase.anon.ThemeT[T]) | (P with typingsSlinky.emotionStyledBase.anon.ThemeExclude)
}
