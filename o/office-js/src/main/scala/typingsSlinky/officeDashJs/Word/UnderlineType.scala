package typingsSlinky.officeDashJs.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UnderlineType extends js.Object

/**
  *
  * Underline types
  *
  * [Api set: WordApi]
  */
@JSGlobal("Word.UnderlineType")
@js.native
object UnderlineType extends js.Object {
  /**
    *
    * A single dash underline.
    *
    */
  @js.native
  sealed trait dashLine extends UnderlineType
  
  @js.native
  sealed trait dashLineHeavy extends UnderlineType
  
  @js.native
  sealed trait dashLineLong extends UnderlineType
  
  @js.native
  sealed trait dashLineLongHeavy extends UnderlineType
  
  /**
    *
    * An alternating dot-dash underline.
    *
    */
  @js.native
  sealed trait dotDashLine extends UnderlineType
  
  @js.native
  sealed trait dotDashLineHeavy extends UnderlineType
  
  /**
    *
    * @deprecated DotLine is no longer supported.
    */
  @js.native
  sealed trait dotLine extends UnderlineType
  
  /**
    *
    * A dotted underline.
    *
    */
  @js.native
  sealed trait dotted extends UnderlineType
  
  @js.native
  sealed trait dottedHeavy extends UnderlineType
  
  /**
    *
    * A double underline.
    *
    */
  @js.native
  sealed trait double extends UnderlineType
  
  /**
    *
    * @deprecated Hidden is no longer supported.
    */
  @js.native
  sealed trait hidden extends UnderlineType
  
  @js.native
  sealed trait mixed extends UnderlineType
  
  /**
    *
    * No underline.
    *
    */
  @js.native
  sealed trait none extends UnderlineType
  
  /**
    *
    * A single underline. This is the default value.
    *
    */
  @js.native
  sealed trait single extends UnderlineType
  
  /**
    *
    * A single thick underline.
    *
    */
  @js.native
  sealed trait thick extends UnderlineType
  
  /**
    *
    * An alternating dot-dot-dash underline.
    *
    */
  @js.native
  sealed trait twoDotDashLine extends UnderlineType
  
  @js.native
  sealed trait twoDotDashLineHeavy extends UnderlineType
  
  /**
    *
    * A single wavy underline.
    *
    */
  @js.native
  sealed trait wave extends UnderlineType
  
  @js.native
  sealed trait waveDouble extends UnderlineType
  
  @js.native
  sealed trait waveHeavy extends UnderlineType
  
  /**
    *
    * Only underline individual words.
    *
    */
  @js.native
  sealed trait word extends UnderlineType
  
  /* "DashLine" */ val dashLine: typingsSlinky.officeDashJs.Word.UnderlineType.dashLine with String = js.native
  /* "DashLineHeavy" */ val dashLineHeavy: typingsSlinky.officeDashJs.Word.UnderlineType.dashLineHeavy with String = js.native
  /* "DashLineLong" */ val dashLineLong: typingsSlinky.officeDashJs.Word.UnderlineType.dashLineLong with String = js.native
  /* "DashLineLongHeavy" */ val dashLineLongHeavy: typingsSlinky.officeDashJs.Word.UnderlineType.dashLineLongHeavy with String = js.native
  /* "DotDashLine" */ val dotDashLine: typingsSlinky.officeDashJs.Word.UnderlineType.dotDashLine with String = js.native
  /* "DotDashLineHeavy" */ val dotDashLineHeavy: typingsSlinky.officeDashJs.Word.UnderlineType.dotDashLineHeavy with String = js.native
  /* "DotLine" */ val dotLine: typingsSlinky.officeDashJs.Word.UnderlineType.dotLine with String = js.native
  /* "Dotted" */ val dotted: typingsSlinky.officeDashJs.Word.UnderlineType.dotted with String = js.native
  /* "DottedHeavy" */ val dottedHeavy: typingsSlinky.officeDashJs.Word.UnderlineType.dottedHeavy with String = js.native
  /* "Double" */ val double: typingsSlinky.officeDashJs.Word.UnderlineType.double with String = js.native
  /* "Hidden" */ val hidden: typingsSlinky.officeDashJs.Word.UnderlineType.hidden with String = js.native
  /* "Mixed" */ val mixed: typingsSlinky.officeDashJs.Word.UnderlineType.mixed with String = js.native
  /* "None" */ val none: typingsSlinky.officeDashJs.Word.UnderlineType.none with String = js.native
  /* "Single" */ val single: typingsSlinky.officeDashJs.Word.UnderlineType.single with String = js.native
  /* "Thick" */ val thick: typingsSlinky.officeDashJs.Word.UnderlineType.thick with String = js.native
  /* "TwoDotDashLine" */ val twoDotDashLine: typingsSlinky.officeDashJs.Word.UnderlineType.twoDotDashLine with String = js.native
  /* "TwoDotDashLineHeavy" */ val twoDotDashLineHeavy: typingsSlinky.officeDashJs.Word.UnderlineType.twoDotDashLineHeavy with String = js.native
  /* "Wave" */ val wave: typingsSlinky.officeDashJs.Word.UnderlineType.wave with String = js.native
  /* "WaveDouble" */ val waveDouble: typingsSlinky.officeDashJs.Word.UnderlineType.waveDouble with String = js.native
  /* "WaveHeavy" */ val waveHeavy: typingsSlinky.officeDashJs.Word.UnderlineType.waveHeavy with String = js.native
  /* "Word" */ val word: typingsSlinky.officeDashJs.Word.UnderlineType.word with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UnderlineType with String] = js.native
}

