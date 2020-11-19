package typingsSlinky.libxslt.mod

import typingsSlinky.libxmljs.mod.Document
import typingsSlinky.libxslt.anon.NoWrapParams
import typingsSlinky.libxslt.anon.OutputFormat
import typingsSlinky.libxslt.internalTypesMod.ApplyCallback
import typingsSlinky.libxslt.internalTypesMod.ApplyDocumentCallback
import typingsSlinky.libxslt.internalTypesMod.ApplyStringCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stylesheet extends js.Object {
  
  @JSName("apply")
  def apply(source: String): String = js.native
  @JSName("apply")
  def apply(source: String, callback: ApplyStringCallback): Unit = js.native
  @JSName("apply")
  def apply(source: String, params: js.UndefOr[scala.Nothing], options: ApplyOptions): String | Document = js.native
  @JSName("apply")
  def apply(source: String, params: js.Object): String = js.native
  @JSName("apply")
  def apply(source: String, params: js.Object, callback: ApplyStringCallback): Unit = js.native
  @JSName("apply")
  def apply(source: String, params: js.Object, options: NoWrapParams): String = js.native
  @JSName("apply")
  def apply(source: String, params: js.Object, options: NoWrapParams, callback: ApplyStringCallback): Unit = js.native
  @JSName("apply")
  def apply(source: String, params: js.Object, options: OutputFormat): Document = js.native
  @JSName("apply")
  def apply(source: String, params: js.Object, options: OutputFormat, callback: ApplyDocumentCallback): Unit = js.native
  @JSName("apply")
  def apply(source: String, params: js.Object, options: ApplyOptions): String | Document = js.native
  @JSName("apply")
  def apply(source: String, params: js.Object, options: ApplyOptions, callback: ApplyCallback): Unit = js.native
  @JSName("apply")
  def apply(source: Document): String | Document = js.native
  @JSName("apply")
  def apply(source: Document, callback: ApplyDocumentCallback): Unit = js.native
  @JSName("apply")
  def apply(source: Document, params: js.UndefOr[scala.Nothing], options: ApplyOptions): String | Document = js.native
  @JSName("apply")
  def apply(source: Document, params: js.Object): String | Document = js.native
  @JSName("apply")
  def apply(source: Document, params: js.Object, callback: ApplyDocumentCallback): Unit = js.native
  @JSName("apply")
  def apply(source: Document, params: js.Object, options: NoWrapParams): String = js.native
  @JSName("apply")
  def apply(source: Document, params: js.Object, options: NoWrapParams, callback: ApplyStringCallback): Unit = js.native
  @JSName("apply")
  def apply(source: Document, params: js.Object, options: OutputFormat): Document = js.native
  @JSName("apply")
  def apply(source: Document, params: js.Object, options: OutputFormat, callback: ApplyDocumentCallback): Unit = js.native
  @JSName("apply")
  def apply(source: Document, params: js.Object, options: ApplyOptions): String | Document = js.native
  @JSName("apply")
  def apply(source: Document, params: js.Object, options: ApplyOptions, callback: ApplyCallback): Unit = js.native
  
  def applyToFile(sourcePath: String, callback: ApplyStringCallback): Unit = js.native
  def applyToFile(sourcePath: String, params: js.Object, callback: ApplyStringCallback): Unit = js.native
  def applyToFile(sourcePath: String, params: js.Object, options: ApplyOptions, callback: ApplyStringCallback): Unit = js.native
  
  @JSName("apply")
  def apply_Document(source: Document): Document = js.native
  @JSName("apply")
  def apply_Document(source: Document, params: js.Object): Document = js.native
  @JSName("apply")
  def apply_Union(source: String): String | Document = js.native
  @JSName("apply")
  def apply_Union(source: String, params: js.Object): String | Document = js.native
}
