package typingsSlinky.jqueryForm

import org.scalajs.dom.raw.ProgressEvent
import typingsSlinky.jquery.JQuery.AjaxSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryFormOptions
  extends AjaxSettings[js.Any] {
  
  var beforeSerialize: js.UndefOr[js.Function2[/* $form */ JQuery, /* options */ this.type, Boolean]] = js.native
  
  var beforeSubmit: js.UndefOr[
    js.Function3[/* formData */ js.Array[_], /* $form */ JQuery, /* options */ this.type, Boolean]
  ] = js.native
  
  var clearForm: js.UndefOr[Boolean] = js.native
  
  var forceSync: js.UndefOr[Boolean] = js.native
  
  var iframe: js.UndefOr[Boolean] = js.native
  
  var iframeSrc: js.UndefOr[String] = js.native
  
  var iframeTarget: js.UndefOr[js.Any] = js.native
  
  var replaceTarget: js.UndefOr[Boolean] = js.native
  
  var resetForm: js.UndefOr[Boolean] = js.native
  
  var semantic: js.UndefOr[Boolean] = js.native
  
  var target: js.UndefOr[js.Any] = js.native
  
  var uploadProgress: js.UndefOr[
    js.Function4[
      /* event */ ProgressEvent, 
      /* position */ Double, 
      /* total */ Double, 
      /* percentComplete */ Double, 
      Unit
    ]
  ] = js.native
}
object JQueryFormOptions {
  
  @scala.inline
  def apply(): JQueryFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryFormOptions]
  }
  
  @scala.inline
  implicit class JQueryFormOptionsMutableBuilder[Self <: JQueryFormOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeSerialize(value: (/* $form */ JQuery, JQueryFormOptions) => Boolean): Self = StObject.set(x, "beforeSerialize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBeforeSerializeUndefined: Self = StObject.set(x, "beforeSerialize", js.undefined)
    
    @scala.inline
    def setBeforeSubmit(value: (/* formData */ js.Array[_], /* $form */ JQuery, JQueryFormOptions) => Boolean): Self = StObject.set(x, "beforeSubmit", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeSubmitUndefined: Self = StObject.set(x, "beforeSubmit", js.undefined)
    
    @scala.inline
    def setClearForm(value: Boolean): Self = StObject.set(x, "clearForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearFormUndefined: Self = StObject.set(x, "clearForm", js.undefined)
    
    @scala.inline
    def setForceSync(value: Boolean): Self = StObject.set(x, "forceSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceSyncUndefined: Self = StObject.set(x, "forceSync", js.undefined)
    
    @scala.inline
    def setIframe(value: Boolean): Self = StObject.set(x, "iframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeSrc(value: String): Self = StObject.set(x, "iframeSrc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeSrcUndefined: Self = StObject.set(x, "iframeSrc", js.undefined)
    
    @scala.inline
    def setIframeTarget(value: js.Any): Self = StObject.set(x, "iframeTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeTargetUndefined: Self = StObject.set(x, "iframeTarget", js.undefined)
    
    @scala.inline
    def setIframeUndefined: Self = StObject.set(x, "iframe", js.undefined)
    
    @scala.inline
    def setReplaceTarget(value: Boolean): Self = StObject.set(x, "replaceTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceTargetUndefined: Self = StObject.set(x, "replaceTarget", js.undefined)
    
    @scala.inline
    def setResetForm(value: Boolean): Self = StObject.set(x, "resetForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetFormUndefined: Self = StObject.set(x, "resetForm", js.undefined)
    
    @scala.inline
    def setSemantic(value: Boolean): Self = StObject.set(x, "semantic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemanticUndefined: Self = StObject.set(x, "semantic", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setUploadProgress(
      value: (/* event */ ProgressEvent, /* position */ Double, /* total */ Double, /* percentComplete */ Double) => Unit
    ): Self = StObject.set(x, "uploadProgress", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUploadProgressUndefined: Self = StObject.set(x, "uploadProgress", js.undefined)
  }
}
