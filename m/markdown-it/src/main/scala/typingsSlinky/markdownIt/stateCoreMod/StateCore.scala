package typingsSlinky.markdownIt.stateCoreMod

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.markdownIt.libMod.MarkdownIt
import typingsSlinky.markdownIt.tokenMod.Nesting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateCore extends js.Object {
  var Token: Instantiable3[
    /* type */ String, 
    /* tag */ String, 
    /* nesting */ Nesting, 
    typingsSlinky.markdownIt.tokenMod.^
  ] = js.native
  var env: js.Any = js.native
  var inlineMode: Boolean = js.native
  /**
    * link to parser instance
    */
  var md: MarkdownIt = js.native
  var src: String = js.native
  var tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^] = js.native
}

object StateCore {
  @scala.inline
  def apply(
    Token: Instantiable3[
      /* type */ String, 
      /* tag */ String, 
      /* nesting */ Nesting, 
      typingsSlinky.markdownIt.tokenMod.^
    ],
    env: js.Any,
    inlineMode: Boolean,
    md: MarkdownIt,
    src: String,
    tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^]
  ): StateCore = {
    val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], inlineMode = inlineMode.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateCore]
  }
  @scala.inline
  implicit class StateCoreOps[Self <: StateCore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToken(
      value: Instantiable3[
          /* type */ String, 
          /* tag */ String, 
          /* nesting */ Nesting, 
          typingsSlinky.markdownIt.tokenMod.^
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInlineMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd(value: MarkdownIt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokens(value: js.Array[typingsSlinky.markdownIt.tokenMod.^]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

