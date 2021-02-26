package typingsSlinky.pokerEvaluator

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("poker-evaluator", "CARDS")
  @js.native
  val CARDS: Deck = js.native
  
  @JSImport("poker-evaluator", "HANDTYPES")
  @js.native
  val HANDTYPES: js.Array[HandName] = js.native
  
  @JSImport("poker-evaluator", "evalHand")
  @js.native
  def evalHand(cards: js.Array[Double | String]): EvaluatedHand = js.native
  
  @JSImport("poker-evaluator", "ranks")
  @js.native
  val ranks: Buffer = js.native
  
  type Deck = StringDictionary[Double]
  
  @js.native
  trait EvaluatedHand extends StObject {
    
    var handName: HandName = js.native
    
    // Index of HANDTYPES array
    var handRank: Double = js.native
    
    var handType: Double = js.native
    
    var value: Double = js.native
  }
  object EvaluatedHand {
    
    @scala.inline
    def apply(handName: HandName, handRank: Double, handType: Double, value: Double): EvaluatedHand = {
      val __obj = js.Dynamic.literal(handName = handName.asInstanceOf[js.Any], handRank = handRank.asInstanceOf[js.Any], handType = handType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EvaluatedHand]
    }
    
    @scala.inline
    implicit class EvaluatedHandMutableBuilder[Self <: EvaluatedHand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandName(value: HandName): Self = StObject.set(x, "handName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandRank(value: Double): Self = StObject.set(x, "handRank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandType(value: Double): Self = StObject.set(x, "handType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`invalid hand`
    - typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`high card`
    - typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`one pair`
    - typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`two pairs`
    - typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`three of a kind`
    - typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.straight
    - typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.flush
    - typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`full house`
    - typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`four of a kind`
    - typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`straight flush`
  */
  trait HandName extends StObject
  object HandName {
    
    @scala.inline
    def flush: typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.flush = "flush".asInstanceOf[typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.flush]
    
    @scala.inline
    def `four of a kind`: typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`four of a kind` = ("four of a kind").asInstanceOf[typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`four of a kind`]
    
    @scala.inline
    def `full house`: typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`full house` = ("full house").asInstanceOf[typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`full house`]
    
    @scala.inline
    def `high card`: typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`high card` = ("high card").asInstanceOf[typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`high card`]
    
    @scala.inline
    def `invalid hand`: typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`invalid hand` = ("invalid hand").asInstanceOf[typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`invalid hand`]
    
    @scala.inline
    def `one pair`: typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`one pair` = ("one pair").asInstanceOf[typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`one pair`]
    
    @scala.inline
    def straight: typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.straight = "straight".asInstanceOf[typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.straight]
    
    @scala.inline
    def `straight flush`: typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`straight flush` = ("straight flush").asInstanceOf[typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`straight flush`]
    
    @scala.inline
    def `three of a kind`: typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`three of a kind` = ("three of a kind").asInstanceOf[typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`three of a kind`]
    
    @scala.inline
    def `two pairs`: typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`two pairs` = ("two pairs").asInstanceOf[typingsSlinky.pokerEvaluator.pokerEvaluatorStrings.`two pairs`]
  }
}
