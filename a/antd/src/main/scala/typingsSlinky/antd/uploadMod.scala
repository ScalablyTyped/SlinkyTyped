package typingsSlinky.antd

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.antd.anon.Accept
import typingsSlinky.antd.anon.FileList
import typingsSlinky.antd.uploadInterfaceMod.UploadProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/upload", JSImport.Namespace)
@js.native
object uploadMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.antd.uploadUploadMod.default {
    def this(props: UploadProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Dragger: Instantiable0[typingsSlinky.antd.draggerMod.default] = js.native
    var defaultProps: Accept = js.native
    def getDerivedStateFromProps(nextProps: UploadProps): FileList | Null = js.native
  }
  
}

