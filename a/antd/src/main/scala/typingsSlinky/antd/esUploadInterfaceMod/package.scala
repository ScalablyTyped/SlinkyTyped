package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esUploadInterfaceMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.std.Blob
  import typingsSlinky.std.File

  type HttpRequestHeader = StringDictionary[String]
  type PreviewFileHandler = js.Function1[/* file */ File | Blob, js.Thenable[String]]
  type TransformFileHandler = js.Function1[/* file */ RcFile, String | Blob | File | (js.Thenable[String | Blob | File])]
}
