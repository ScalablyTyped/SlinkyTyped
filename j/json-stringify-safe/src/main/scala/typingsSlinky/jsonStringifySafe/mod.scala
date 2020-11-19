package typingsSlinky.jsonStringifySafe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-stringify-safe", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(obj: js.Any): String = js.native
  def apply(
    obj: js.Any,
    serializer: js.UndefOr[scala.Nothing],
    indent: js.UndefOr[scala.Nothing],
    decycler: EntryProcessor
  ): String = js.native
  def apply(obj: js.Any, serializer: js.UndefOr[scala.Nothing], indent: String): String = js.native
  def apply(obj: js.Any, serializer: js.UndefOr[scala.Nothing], indent: String, decycler: EntryProcessor): String = js.native
  def apply(obj: js.Any, serializer: js.UndefOr[scala.Nothing], indent: Double): String = js.native
  def apply(obj: js.Any, serializer: js.UndefOr[scala.Nothing], indent: Double, decycler: EntryProcessor): String = js.native
  def apply(obj: js.Any, serializer: js.UndefOr[scala.Nothing], indent: Null, decycler: EntryProcessor): String = js.native
  def apply(obj: js.Any, serializer: Null, indent: js.UndefOr[scala.Nothing], decycler: EntryProcessor): String = js.native
  def apply(obj: js.Any, serializer: Null, indent: String): String = js.native
  def apply(obj: js.Any, serializer: Null, indent: String, decycler: EntryProcessor): String = js.native
  def apply(obj: js.Any, serializer: Null, indent: Double): String = js.native
  def apply(obj: js.Any, serializer: Null, indent: Double, decycler: EntryProcessor): String = js.native
  def apply(obj: js.Any, serializer: Null, indent: Null, decycler: EntryProcessor): String = js.native
  def apply(obj: js.Any, serializer: EntryProcessor): String = js.native
  def apply(
    obj: js.Any,
    serializer: EntryProcessor,
    indent: js.UndefOr[scala.Nothing],
    decycler: EntryProcessor
  ): String = js.native
  def apply(obj: js.Any, serializer: EntryProcessor, indent: String): String = js.native
  def apply(obj: js.Any, serializer: EntryProcessor, indent: String, decycler: EntryProcessor): String = js.native
  def apply(obj: js.Any, serializer: EntryProcessor, indent: Double): String = js.native
  def apply(obj: js.Any, serializer: EntryProcessor, indent: Double, decycler: EntryProcessor): String = js.native
  def apply(obj: js.Any, serializer: EntryProcessor, indent: Null, decycler: EntryProcessor): String = js.native
  
  def getSerialize(): EntryProcessor = js.native
  def getSerialize(serializer: Null, decycler: EntryProcessor): EntryProcessor = js.native
  def getSerialize(serializer: EntryProcessor): EntryProcessor = js.native
  def getSerialize(serializer: EntryProcessor, decycler: EntryProcessor): EntryProcessor = js.native
  
  type EntryProcessor = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
}
