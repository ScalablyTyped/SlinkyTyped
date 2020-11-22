package typingsSlinky.abortableIterator.mod

import org.scalajs.dom.experimental.AbortSignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("abortable-iterator", "duplex")
@js.native
object duplex extends js.Object {
  
  def apply[TSource, TSinkSource, TSinkReturn](duplex: Duplex_[TSource, TSinkSource, TSinkReturn]): Duplex_[TSource, TSinkSource, TSinkReturn] = js.native
  def apply[TSource, TSinkSource, TSinkReturn](
    duplex: Duplex_[TSource, TSinkSource, TSinkReturn],
    signal: js.UndefOr[scala.Nothing],
    options: Options[TSource]
  ): Duplex_[TSource, TSinkSource, TSinkReturn] = js.native
  def apply[TSource, TSinkSource, TSinkReturn](duplex: Duplex_[TSource, TSinkSource, TSinkReturn], signals: Signals[TSource]): Duplex_[TSource, TSinkSource, TSinkReturn] = js.native
  def apply[TSource, TSinkSource, TSinkReturn](duplex: Duplex_[TSource, TSinkSource, TSinkReturn], signal: AbortSignal): Duplex_[TSource, TSinkSource, TSinkReturn] = js.native
  def apply[TSource, TSinkSource, TSinkReturn](duplex: Duplex_[TSource, TSinkSource, TSinkReturn], signal: AbortSignal, options: Options[TSource]): Duplex_[TSource, TSinkSource, TSinkReturn] = js.native
}
