package typingsSlinky.inquirer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Provides valid choices for the question of the `TChoiceMap`.
    *
    * @template TChoiceMap
    * The choice-types to provide.
    */
  type DistinctChoice[TChoiceMap] = java.lang.String | (/* import warning: importer.ImportType#apply Failed type conversion: TChoiceMap[keyof TChoiceMap] */ js.Any)
  
  /**
    * Represents one of the available questions.
    *
    * @template T
    * The type of the answers.
    */
  /* Inlined inquirer.inquirer.QuestionMap<T>[keyof inquirer.inquirer.QuestionMap<T>] */
  type DistinctQuestion[T /* <: typingsSlinky.inquirer.mod.Answers */] = typingsSlinky.inquirer.inquirerStrings.`type`
  
  /**
    * Represents a dynamic property for a question.
    */
  type DynamicQuestionProperty[T, TAnswers /* <: typingsSlinky.inquirer.mod.Answers */] = T | (js.Function1[/* answers */ TAnswers, T])
  
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
    * Represents a union which preserves autocompletion.
    *
    * @template T
    * The keys which are available for autocompletion.
    *
    * @template F
    * The fallback-type.
    */
  type LiteralUnion[T /* <: F */, F] = T | (F with js.Object)
  
  /**
    * Provides options for a question for the `NumberPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type NumberQuestionOptions[T /* <: typingsSlinky.inquirer.mod.Answers */] = typingsSlinky.inquirer.mod.InputQuestionOptions[T]
  
  /**
    * Represents a collection of questions.
    *
    * @template T
    * The type of the answers.
    */
  type QuestionCollection[T /* <: typingsSlinky.inquirer.mod.Answers */] = typingsSlinky.inquirer.mod.DistinctQuestion[T] | js.Array[typingsSlinky.inquirer.mod.DistinctQuestion[T]] | typingsSlinky.rxjs.mod.Observable_[typingsSlinky.inquirer.mod.DistinctQuestion[T]]
  
  /**
    * Indicates the type of a question
    */
  type QuestionTypeName = /* import warning: importer.ImportType#apply Failed type conversion: inquirer.inquirer.DistinctQuestion<inquirer.inquirer.Answers>['type'] */ js.Any
  
  /**
    * Provides options for a question for the `RawListPrompt`.
    *
    * @template T
    * The type of the answers.
    */
  type RawListQuestionOptions[T /* <: typingsSlinky.inquirer.mod.Answers */] = typingsSlinky.inquirer.mod.ListQuestionOptions[T]
  
  /**
    * Provides the functionality to transform an answer.
    *
    * @template T
    * The type of the answers.
    */
  type Transformer[T /* <: typingsSlinky.inquirer.mod.Answers */] = js.UndefOr[
    js.Function3[
      /* input */ js.Any, 
      /* answers */ T, 
      /* flags */ typingsSlinky.inquirer.anon.IsFinal, 
      java.lang.String | js.Promise[java.lang.String]
    ]
  ]
  
  /**
    * Converts the specified union-type `U` to an intersection-type.
    *
    * @template U
    * The union to convert to an intersection.
    */
  type UnionToIntersection[U] = js.Any
  
  /**
    * Provides the functionality to validate answers.
    *
    * @template T
    * The type of the answers.
    */
  type Validator[T /* <: typingsSlinky.inquirer.mod.Answers */] = js.UndefOr[
    js.Function2[
      /* input */ js.Any, 
      /* answers */ js.UndefOr[T], 
      scala.Boolean | java.lang.String | (js.Promise[scala.Boolean | java.lang.String])
    ]
  ]
}
