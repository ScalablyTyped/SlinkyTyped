package typingsSlinky.ckeditor.CKEDITOR.fileTools

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ckeditor.CKEDITOR.plugins.widget.definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait uploadWidgetDefinition extends definition {
  var additionalRequestParameters: js.Any = js.native
  var loadMethod: String = js.native
  var loaderType: js.Any = js.native
  var skipNotifications: Boolean = js.native
  var supportedTypes: String = js.native
  var uploadUrl: String = js.native
  def fileToElement(pastedFile: js.Any): HTMLElement = js.native
  def onAbort(): Boolean = js.native
  def onError(): Boolean = js.native
  def onLoaded(): Boolean = js.native
  def onUploaded(): Boolean = js.native
  def onUploading(): Boolean = js.native
  def replaceWith(): js.Any = js.native
}

object uploadWidgetDefinition {
  @scala.inline
  def apply(
    additionalRequestParameters: js.Any,
    fileToElement: js.Any => HTMLElement,
    loadMethod: String,
    loaderType: js.Any,
    onAbort: () => Boolean,
    onError: () => Boolean,
    onLoaded: () => Boolean,
    onUploaded: () => Boolean,
    onUploading: () => Boolean,
    replaceWith: () => js.Any,
    skipNotifications: Boolean,
    supportedTypes: String,
    uploadUrl: String
  ): uploadWidgetDefinition = {
    val __obj = js.Dynamic.literal(additionalRequestParameters = additionalRequestParameters.asInstanceOf[js.Any], fileToElement = js.Any.fromFunction1(fileToElement), loadMethod = loadMethod.asInstanceOf[js.Any], loaderType = loaderType.asInstanceOf[js.Any], onAbort = js.Any.fromFunction0(onAbort), onError = js.Any.fromFunction0(onError), onLoaded = js.Any.fromFunction0(onLoaded), onUploaded = js.Any.fromFunction0(onUploaded), onUploading = js.Any.fromFunction0(onUploading), replaceWith = js.Any.fromFunction0(replaceWith), skipNotifications = skipNotifications.asInstanceOf[js.Any], supportedTypes = supportedTypes.asInstanceOf[js.Any], uploadUrl = uploadUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[uploadWidgetDefinition]
  }
  @scala.inline
  implicit class uploadWidgetDefinitionOps[Self <: uploadWidgetDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalRequestParameters(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalRequestParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileToElement(value: js.Any => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileToElement")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaderType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnAbort(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnError(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnLoaded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnUploaded(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploaded")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnUploading(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUploading")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReplaceWith(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSkipNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedTypes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUploadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadUrl")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

