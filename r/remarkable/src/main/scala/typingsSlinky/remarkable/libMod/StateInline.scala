package typingsSlinky.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateInline extends StObject {
  
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
  
  def push(token: ContentToken): Unit = js.native
  
  def pushPending(): Unit = js.native
  
  var src: String = js.native
  
  var tokens: js.Array[ContentToken] = js.native
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
  implicit class StateInlineMutableBuilder[Self <: StateInline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnv(value: Env): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInLabel(value: Boolean): Self = StObject.set(x, "isInLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUnmatchedScopes(value: Double): Self = StObject.set(x, "labelUnmatchedScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkContent(value: String): Self = StObject.set(x, "linkContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkLevel(value: Double): Self = StObject.set(x, "linkLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParser(value: ParserInline): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending(value: String): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingLevel(value: Double): Self = StObject.set(x, "pendingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosMax(value: Double): Self = StObject.set(x, "posMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPush(value: ContentToken => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPushPending(value: () => Unit): Self = StObject.set(x, "pushPending", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokens(value: js.Array[ContentToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokensVarargs(value: ContentToken*): Self = StObject.set(x, "tokens", js.Array(value :_*))
  }
}
