package typingsSlinky.layuiSrc.layui

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.layuiSrc.layuiSrcStrings.audio
import typingsSlinky.layuiSrc.layuiSrcStrings.file
import typingsSlinky.layuiSrc.layuiSrcStrings.images
import typingsSlinky.layuiSrc.layuiSrcStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadOption extends StObject {
  
  var accept: js.UndefOr[images | file | video | audio] = js.native
  
  var acceptMime: js.UndefOr[String] = js.native
  
  var allDone: js.UndefOr[js.Function1[/* obj */ js.Object, Unit]] = js.native
  
  var auto: js.UndefOr[Boolean] = js.native
  
  var before: js.UndefOr[js.Function1[/* obj */ js.Object, Unit]] = js.native
  
  var bindAction: js.UndefOr[String | HTMLElement] = js.native
  
  var choose: js.UndefOr[js.Function1[/* obj */ js.Object, Unit]] = js.native
  
  var data: js.UndefOr[js.Object] = js.native
  
  var done: js.UndefOr[
    js.Function3[/* res */ js.Object, /* index */ Double, /* upload */ js.Function0[Unit], Unit]
  ] = js.native
  
  var drag: js.UndefOr[Boolean] = js.native
  
  var elem: js.UndefOr[String | HTMLElement] = js.native
  
  var error: js.UndefOr[js.Function2[/* index */ Double, /* upload */ js.Function0[Unit], Unit]] = js.native
  
  var exts: js.UndefOr[String] = js.native
  
  var field: js.UndefOr[String] = js.native
  
  var header: js.UndefOr[js.Object] = js.native
  
  var multiple: js.UndefOr[Boolean] = js.native
  
  var number: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object UploadOption {
  
  @scala.inline
  def apply(): UploadOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadOption]
  }
  
  @scala.inline
  implicit class UploadOptionMutableBuilder[Self <: UploadOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: images | file | video | audio): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptMime(value: String): Self = StObject.set(x, "acceptMime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptMimeUndefined: Self = StObject.set(x, "acceptMime", js.undefined)
    
    @scala.inline
    def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    @scala.inline
    def setAllDone(value: /* obj */ js.Object => Unit): Self = StObject.set(x, "allDone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAllDoneUndefined: Self = StObject.set(x, "allDone", js.undefined)
    
    @scala.inline
    def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
    
    @scala.inline
    def setBefore(value: /* obj */ js.Object => Unit): Self = StObject.set(x, "before", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setBindAction(value: String | HTMLElement): Self = StObject.set(x, "bindAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindActionHTMLElement(value: HTMLElement): Self = StObject.set(x, "bindAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindActionUndefined: Self = StObject.set(x, "bindAction", js.undefined)
    
    @scala.inline
    def setChoose(value: /* obj */ js.Object => Unit): Self = StObject.set(x, "choose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChooseUndefined: Self = StObject.set(x, "choose", js.undefined)
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDone(value: (/* res */ js.Object, /* index */ Double, /* upload */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "done", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setElem(value: String | HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElemHTMLElement(value: HTMLElement): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElemUndefined: Self = StObject.set(x, "elem", js.undefined)
    
    @scala.inline
    def setError(value: (/* index */ Double, /* upload */ js.Function0[Unit]) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExts(value: String): Self = StObject.set(x, "exts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtsUndefined: Self = StObject.set(x, "exts", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
