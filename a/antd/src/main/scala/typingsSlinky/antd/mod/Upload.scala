package typingsSlinky.antd.mod

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.antd.anon.Accept
import typingsSlinky.antd.anon.FileList
import typingsSlinky.antd.uploadInterfaceMod.UploadProps
import typingsSlinky.antd.uploadMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Upload")
@js.native
class Upload protected () extends default {
  def this(props: UploadProps[_]) = this()
}

/* static members */
@JSImport("antd", "Upload")
@js.native
object Upload extends js.Object {
  var Dragger: Instantiable0[typingsSlinky.antd.draggerMod.default] = js.native
  var defaultProps: Accept = js.native
  def getDerivedStateFromProps(nextProps: UploadProps[_]): FileList | Null = js.native
}

