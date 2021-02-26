package typingsSlinky.inquirer

import typingsSlinky.inquirer.mod.Answers
import typingsSlinky.inquirer.mod.CheckboxChoiceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object choiceMod {
  
  /**
    * Represents a choice for several question-types.
    *
    * @template T
    * The type of the answers.
    */
  @JSImport("inquirer/lib/objects/choice", JSImport.Namespace)
  @js.native
  class ^[T /* <: Answers */] protected () extends Choice[T] {
    /**
      * Initializes a new instance of the `Choice` class.
      *
      * @param value
      * The value of the choice.
      *
      * @param answers
      * An object which contains the answers to the questions.
      */
    def this(value: js.Any, answers: T) = this()
  }
  
  /**
    * Represents a choice for several question-types.
    *
    * @template T
    * The type of the answers.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.inquirer.mod.ChoiceBase because Already inherited
  - typingsSlinky.inquirer.mod.ChoiceOptions because Already inherited
  - typingsSlinky.inquirer.mod.ExpandChoiceOptions because var conflicts: extra, name, short, `type`, value. Inlined key */ @js.native
  trait Choice[T /* <: Answers */] extends CheckboxChoiceOptions[T] {
    
    /**
      * @inheritdoc
      */
    @JSName("disabled")
    var disabled_Choice: Boolean = js.native
    
    /**
      * The key to press for selecting the choice.
      *
      * @inheritdoc
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * @inheritdoc
      */
    @JSName("name")
    var name_Choice: String = js.native
    
    /**
      * @inheritdoc
      */
    @JSName("short")
    var short_Choice: String = js.native
  }
  object Choice {
    
    @scala.inline
    def apply[T /* <: Answers */](disabled: Boolean, name: String, short: String): Choice[T] = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choice[T]]
    }
    
    @scala.inline
    implicit class ChoiceMutableBuilder[Self <: Choice[_], T /* <: Answers */] (val x: Self with Choice[T]) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
}
