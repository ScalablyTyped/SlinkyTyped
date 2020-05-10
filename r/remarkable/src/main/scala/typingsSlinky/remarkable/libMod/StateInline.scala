package typingsSlinky.remarkable.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateInline extends js.Object {
  var env: Env = js.native
  /** Set true when seek link label */
  var isInLabel: Boolean = js.native
  /**
    * Track unpaired `[` for link labels.
    */
  var labelUnmatchedScopes: Double = js.native
  var level: Double = js.native
  /**
    * Temporary storage for link url.
    */
  var linkContent: String = js.native
  /**
    * Increment for each nesting link.
    * Used to prevent nesting in definitions.
    */
  var linkLevel: Double = js.native
  var parser: ParserInline = js.native
  var pending: String = js.native
  var pendingLevel: Double = js.native
  var pos: Double = js.native
  var posMax: Double = js.native
  var src: String = js.native
  var tokens: js.Array[ContentToken] = js.native
  def push(token: ContentToken): Unit = js.native
  def pushPending(): Unit = js.native
}

object StateInline {
  @scala.inline
  def apply(
    env: Env,
    isInLabel: Boolean,
    labelUnmatchedScopes: Double,
    level: Double,
    linkContent: String,
    linkLevel: Double,
    parser: ParserInline,
    pending: String,
    pendingLevel: Double,
    pos: Double,
    posMax: Double,
    push: ContentToken => Unit,
    pushPending: () => Unit,
    src: String,
    tokens: js.Array[ContentToken]
  ): StateInline = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], isInLabel = isInLabel.asInstanceOf[js.Any], labelUnmatchedScopes = labelUnmatchedScopes.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], linkContent = linkContent.asInstanceOf[js.Any], linkLevel = linkLevel.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], pendingLevel = pendingLevel.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], posMax = posMax.asInstanceOf[js.Any], push = js.Any.fromFunction1(push), pushPending = js.Any.fromFunction0(pushPending), src = src.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateInline]
  }
  @scala.inline
  implicit class StateInlineOps[Self <: StateInline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnv(value: Env): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelUnmatchedScopes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelUnmatchedScopes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParser(value: ParserInline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parser")(value.asInstanceOf[js.Any])
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
    def withPush(value: ContentToken => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPushPending(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushPending")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTokens(value: js.Array[ContentToken]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokens")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

