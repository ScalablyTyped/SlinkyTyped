package typingsSlinky.faker.Faker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Post extends js.Object {
  var paragraph: String = js.native
  var sentence: String = js.native
  var sentences: String = js.native
  var words: String = js.native
}

object Post {
  @scala.inline
  def apply(paragraph: String, sentence: String, sentences: String, words: String): Post = {
    val __obj = js.Dynamic.literal(paragraph = paragraph.asInstanceOf[js.Any], sentence = sentence.asInstanceOf[js.Any], sentences = sentences.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[Post]
  }
  @scala.inline
  implicit class PostOps[Self <: Post] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParagraph(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSentence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSentences(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sentences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

