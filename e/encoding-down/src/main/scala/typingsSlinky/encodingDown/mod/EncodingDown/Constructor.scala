package typingsSlinky.encodingDown.mod.EncodingDown

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.abstractLeveldown.mod.AbstractLevelDOWN
import typingsSlinky.levelCodec.mod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Constructor
  extends // tslint:disable-next-line:no-unnecessary-generics
Instantiable1[
      /* db */ AbstractLevelDOWN[js.Any, js.Any], 
      typingsSlinky.encodingDown.mod.EncodingDown[js.Object, js.Object]
    ]
     with Instantiable2[
      /* db */ AbstractLevelDOWN[js.Any, js.Any], 
      /* options */ CodecOptions, 
      typingsSlinky.encodingDown.mod.EncodingDown[js.Object, js.Object]
    ] {
  
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[K, V](db: AbstractLevelDOWN[_, _]): typingsSlinky.encodingDown.mod.EncodingDown[K, V] = js.native
  def apply[K, V](db: AbstractLevelDOWN[_, _], options: CodecOptions): typingsSlinky.encodingDown.mod.EncodingDown[K, V] = js.native
}
