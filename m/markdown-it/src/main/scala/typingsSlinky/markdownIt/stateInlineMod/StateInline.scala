package typingsSlinky.markdownIt.stateInlineMod

import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.markdownIt.libMod.MarkdownIt
import typingsSlinky.markdownIt.tokenMod.Nesting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateInline extends js.Object {
  var Token: Instantiable3[
    /* type */ String, 
    /* tag */ String, 
    /* nesting */ Nesting, 
    typingsSlinky.markdownIt.tokenMod.^
  ] = js.native
  /**
    * Stores { start: end } pairs. Useful for backtrack
    * optimization of pairs parse (emphasis, strikes).
    */
  var cache: js.Any = js.native
  /**
    * List of emphasis-like delimiters for current tag
    */
  var delimiters: js.Array[Delimiter] = js.native
  var env: js.Any = js.native
  var level: Double = js.native
  var md: MarkdownIt = js.native
  var pending: String = js.native
  var pendingLevel: Double = js.native
  var pos: Double = js.native
  var posMax: Double = js.native
  var src: String = js.native
  var tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^] = js.native
  var tokens_meta: js.Array[TokenMata] = js.native
  /**
    * Push new token to "stream".
    * If pending text exists - flush it as text token
    */
  def push(`type`: String, tag: String, nesting: Nesting): typingsSlinky.markdownIt.tokenMod.^ = js.native
  // Stack of delimiter lists for upper level tags
  // _prev_delimiters: StateInline.Delimiter[][];
  /**
    * Flush pending text
    */
  def pushPending(): typingsSlinky.markdownIt.tokenMod.^ = js.native
  /**
    * Scan a sequence of emphasis-like markers, and determine whether
    * it can start an emphasis sequence or end an emphasis sequence.
    *
    * @param start position to scan from (it should point at a valid marker);
    * @param canSplitWord determine if these markers can be found inside a word
    */
  def scanDelims(start: Double, canSplitWord: Boolean): Scanned = js.native
}

object StateInline {
  @scala.inline
  def apply(
    Token: Instantiable3[
      /* type */ String, 
      /* tag */ String, 
      /* nesting */ Nesting, 
      typingsSlinky.markdownIt.tokenMod.^
    ],
    cache: js.Any,
    delimiters: js.Array[Delimiter],
    env: js.Any,
    level: Double,
    md: MarkdownIt,
    pending: String,
    pendingLevel: Double,
    pos: Double,
    posMax: Double,
    push: (String, String, Nesting) => typingsSlinky.markdownIt.tokenMod.^,
    pushPending: () => typingsSlinky.markdownIt.tokenMod.^,
    scanDelims: (Double, Boolean) => Scanned,
    src: String,
    tokens: js.Array[typingsSlinky.markdownIt.tokenMod.^],
    tokens_meta: js.Array[TokenMata]
  ): StateInline = {
    val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pendingLevel = pendingLevel.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], posMax = posMax.asInstanceOf[js.Any], push = js.Any.fromFunction3(push), pushPending = js.Any.fromFunction0(pushPending), scanDelims = js.Any.fromFunction2(scanDelims), src = src.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], tokens_meta = tokens_meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateInline]
  }
  @scala.inline
  implicit class StateInlineOps[Self <: StateInline] (val x: Self) extends AnyVal {
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
    def withCache(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelimiters(value: js.Array[Delimiter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMd(value: MarkdownIt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPending(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPendingLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(value: (String, String, Nesting) => typingsSlinky.markdownIt.tokenMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPushPending(value: () => typingsSlinky.markdownIt.tokenMod.^): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushPending")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScanDelims(value: (Double, Boolean) => Scanned): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scanDelims")(js.Any.fromFunction2(value))
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
    @scala.inline
    def withTokens_meta(value: js.Array[TokenMata]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens_meta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

