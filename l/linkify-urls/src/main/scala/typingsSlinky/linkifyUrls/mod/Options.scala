package typingsSlinky.linkifyUrls.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.linkifyUrls.linkifyUrlsStrings.dom
import typingsSlinky.linkifyUrls.linkifyUrlsStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		HTML attributes to add to the link.
  		*/
  val attributes: js.UndefOr[StringDictionary[String | Double | Boolean | js.Array[String]]] = js.native
  /**
  		Format of the generated content.
  		`'string'` will return it as a flat string like `'Visit <a href="https://example.com">https://example.com</a>'`.
  		`'dom'` will return it as a `DocumentFragment` ready to be appended in a DOM safely, like `DocumentFragment(TextNode('Visit '), HTMLAnchorElement('https://example.com'))`. This type only works in the browser.
  		*/
  val `type`: js.UndefOr[string | dom] = js.native
  /**
  		Set a custom HTML value for the link.
  		Default: The URL.
  		@example
  		```
  		linkifyUrls('See https://sindresorhus.com/foo', {
  			value: url => new URL(url).pathname
  		});
  		//=> 'See <a href="https://sindresorhus.com/foo">/foo</a>'
  		```
  		*/
  val value: js.UndefOr[String | (js.Function1[/* url */ String, String])] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: StringDictionary[String | Double | Boolean | js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: string | dom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withValueFunction1(value: /* url */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValue(value: String | (js.Function1[/* url */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

