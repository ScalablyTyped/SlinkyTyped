package typingsSlinky.emailTemplates.mod

import typingsSlinky.emailTemplates.emailTemplatesBooleans.`false`
import typingsSlinky.htmlToText.mod.HtmlToTextOptions
import typingsSlinky.nodemailer.mailerMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailConfig[T] extends js.Object {
  /**
    * defaults to false, unless you pass your own render function,
    * and in that case it will be automatically set to true.
    * @default false
    */
  var customRender: js.UndefOr[Boolean] = js.native
  /**
    * a function that returns the path to a template file
    * @default (path: string, template: string) => string
    */
  var getPath: js.UndefOr[
    js.Function3[/* path */ String, /* template */ String, /* locals */ js.Any, String]
  ] = js.native
  /**
    * <Https://github.com/werk85/node-html-to-text>
    *
    * configuration object for html-to-text
    */
  var htmlToText: js.UndefOr[HtmlToTextOptions | `false`] = js.native
  /**
    * Set to object to configure and Enable <https://github.com/ladjs/il8n>
    */
  var i18n: js.UndefOr[js.Any] = js.native
  /**
    * <https://github.com/Automattic/juice>
    */
  var juice: js.UndefOr[Boolean] = js.native
  /**
    * <https://github.com/Automattic/juice>
    */
  var juiceResources: js.UndefOr[js.Any] = js.native
  /**
    * The message <Nodemailer.com/message/>
    */
  var message: Options = js.native
  /**
    * Preview the email
    */
  var preview: js.UndefOr[Boolean | PreviewEmailOpts] = js.native
  /**
    * Pass a custom render function if necessary
    */
  var render: js.UndefOr[js.Function2[/* view */ String, /* locals */ js.UndefOr[T], js.Promise[_]]] = js.native
  /**
    * Do you really want to send, false for test or development
    */
  var send: js.UndefOr[Boolean] = js.native
  /**
    * You can pass an option to prefix subject lines with a string
    * env === 'production' ? false : `[${env.toUpperCase()}] `; // <--- HERE
    */
  var subjectPrefix: js.UndefOr[String | `false`] = js.native
  /**
    * force text-only rendering of template (disregards template folder)
    */
  var textOnly: js.UndefOr[Boolean] = js.native
  /**
    * The nodemailer Transport created via nodemailer.createTransport
    */
  var transport: js.UndefOr[NodeMailerTransportOptions] = js.native
  /**
    * The email template directory and engine information
    */
  var views: js.UndefOr[View] = js.native
}

object EmailConfig {
  @scala.inline
  def apply[T](message: Options): EmailConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailConfig[T]]
  }
  @scala.inline
  implicit class EmailConfigOps[Self[t] <: EmailConfig[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withMessage(value: Options): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomRender(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRender: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRender")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPath(value: (/* path */ String, /* template */ String, /* locals */ js.Any) => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPath")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutGetPath: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPath")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlToText(value: HtmlToTextOptions | `false`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlToText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlToText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlToText")(js.undefined)
        ret
    }
    @scala.inline
    def withI18n(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutI18n: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("i18n")(js.undefined)
        ret
    }
    @scala.inline
    def withJuice(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("juice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJuice: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("juice")(js.undefined)
        ret
    }
    @scala.inline
    def withJuiceResources(value: js.Any): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("juiceResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJuiceResources: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("juiceResources")(js.undefined)
        ret
    }
    @scala.inline
    def withPreview(value: Boolean | PreviewEmailOpts): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: (/* view */ String, /* locals */ js.UndefOr[T]) => js.Promise[_]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRender: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withSend(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSend: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.undefined)
        ret
    }
    @scala.inline
    def withSubjectPrefix(value: String | `false`): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubjectPrefix: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOnly(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOnly: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: NodeMailerTransportOptions): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
    @scala.inline
    def withViews(value: View): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViews: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("views")(js.undefined)
        ret
    }
  }
  
}

