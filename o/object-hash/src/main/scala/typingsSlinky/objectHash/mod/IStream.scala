package typingsSlinky.objectHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStream extends js.Object {
  
  var update: js.UndefOr[
    js.Function3[
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  
  var write: js.UndefOr[
    js.Function3[
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding, 
      /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit], 
      Unit
    ]
  ] = js.native
}
object IStream {
  
  @scala.inline
  def apply(): IStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStream]
  }
  
  @scala.inline
  implicit class IStreamOps[Self <: IStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUpdate(
      value: (/* chunk */ js.Any, /* encoding */ BufferEncoding, /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]) => Unit
    ): Self = this.set("update", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    
    @scala.inline
    def setWrite(
      value: (/* chunk */ js.Any, /* encoding */ BufferEncoding, /* callback */ js.Function1[/* error */ js.UndefOr[js.Error | Null], Unit]) => Unit
    ): Self = this.set("write", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteWrite: Self = this.set("write", js.undefined)
  }
}
