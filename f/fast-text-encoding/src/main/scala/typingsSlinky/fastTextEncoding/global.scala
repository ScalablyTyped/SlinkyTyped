package typingsSlinky.fastTextEncoding

import typingsSlinky.fastTextEncoding.fastTextEncoding.TextDecoderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object fastTextEncoding extends js.Object {
    /**
      * TextDecoder instance.
      */
    @js.native
    class TextDecoderClass ()
      extends typingsSlinky.fastTextEncoding.fastTextEncoding.TextDecoderClass {
      def this(utfLabel: String) = this()
      def this(utfLabel: String, options: TextDecoderOptions) = this()
    }
    
    /**
      * TextEncoder instance.
      */
    @js.native
    class TextEncoderClass ()
      extends typingsSlinky.fastTextEncoding.fastTextEncoding.TextEncoderClass {
      def this(label: String) = this()
    }
    
  }
  
}

