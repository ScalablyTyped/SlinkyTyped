package typingsSlinky.inquirer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * A set of answers.
    */
  type Answers = typingsSlinky.std.Record[java.lang.String, js.Any]
  /**
    * Represents a dynamic property for a question which can be fetched asynchronously.
    */
  type AsyncDynamicQuestionProperty[T, TAnswers /* <: typingsSlinky.inquirer.mod.Answers */] = typingsSlinky.inquirer.mod.DynamicQuestionProperty[T | js.Promise[T], TAnswers]
  /**
    * Provides options for a question for the `CheckboxPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type CheckboxQuestionOptions[T /* <: typingsSlinky.inquirer.mod.Answers */] = typingsSlinky.inquirer.mod.ListQuestionOptionsBase[T, typingsSlinky.inquirer.mod.CheckboxChoiceMap[T]]
  /**
    * Represents a set of choices.
    */
  type ChoiceCollection[T /* <: typingsSlinky.inquirer.mod.Answers */] = js.Array[
    typingsSlinky.inquirer.mod.DistinctChoice[typingsSlinky.inquirer.mod.AllChoiceMap[typingsSlinky.inquirer.mod.Answers]]
  ]
  /**
    * Provides options for a question for the `ConfirmPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type ConfirmQuestionOptions[T /* <: typingsSlinky.inquirer.mod.Answers */] = typingsSlinky.inquirer.mod.Question[T]
  /**
    * Represents one of the available questions.
    *
    * @template T
    * The type of the answers.
    */
  /* Inlined inquirer.inquirer.QuestionMap<T>[keyof inquirer.inquirer.QuestionMap<T>] */
  type DistinctQuestion[T /* <: typingsSlinky.inquirer.mod.Answers */] = typingsSlinky.inquirer.inquirerStrings.`type`
  /**
    * Provides options for a question for the `EditorPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type EditorQuestionOptions[T /* <: typingsSlinky.inquirer.mod.Answers */] = typingsSlinky.inquirer.mod.Question[T]
  /**
    * Provides options for a question for the `ExpandPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type ExpandQuestionOptions[T /* <: typingsSlinky.inquirer.mod.Answers */] = typingsSlinky.inquirer.mod.ListQuestionOptionsBase[T, typingsSlinky.inquirer.mod.ExpandChoiceMap[T]]
  /**
    * Represents either a key of `T` or a `string`.
    *
    * @template T
    * The type of the keys to suggest.
    */
  type KeyUnion[T] = typingsSlinky.inquirer.mod.LiteralUnion[
    typingsSlinky.std.Extract[/* keyof T */ java.lang.String, java.lang.String], 
    java.lang.String
  ]
  /**
    * Provides options for a question for the `ListPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type ListQuestionOptions[T /* <: typingsSlinky.inquirer.mod.Answers */] = typingsSlinky.inquirer.mod.ListQuestionOptionsBase[T, typingsSlinky.inquirer.mod.ListChoiceMap[T]]
  /**
    * Provides options for a question for the `NumberPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type NumberQuestionOptions[T /* <: typingsSlinky.inquirer.mod.Answers */] = typingsSlinky.inquirer.mod.InputQuestionOptions[T]
  /**
    * Provides options for a question for the `RawListPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type RawListQuestionOptions[T /* <: typingsSlinky.inquirer.mod.Answers */] = typingsSlinky.inquirer.mod.ListQuestionOptions[T]
  /**
    * Converts the specified union-type `U` to an intersection-type.
    *
    * @template U
    * The union to convert to an intersection.
    */
  type UnionToIntersection[U] = js.Any
}
