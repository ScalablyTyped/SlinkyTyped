package typingsSlinky.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * A function that calls the updateLintingCallback with any errors found during the linting process.
    */
  type AsyncLinter = js.Function4[
    /* content */ java.lang.String, 
    /* updateLintingCallback */ typingsSlinky.codemirror.mod.UpdateLintingCallback, 
    /* options */ typingsSlinky.codemirror.mod.LintStateOptions, 
    /* codeMirror */ typingsSlinky.codemirror.mod.Editor, 
    scala.Unit
  ]
  type HintFunction = js.Function1[/* cm */ typingsSlinky.codemirror.mod.Editor, typingsSlinky.codemirror.mod.Hints]
  type KeyMap = org.scalablytyped.runtime.StringDictionary[
    typingsSlinky.codemirror.codemirrorBooleans.`false` | java.lang.String | (js.Function1[
      /* instance */ typingsSlinky.codemirror.mod.Editor, 
      scala.Unit | typingsSlinky.codemirror.AnonToString
    ])
  ]
  /**
    * A function that return errors found during the linting process.
    */
  type Linter = js.Function3[
    /* content */ java.lang.String, 
    /* options */ typingsSlinky.codemirror.mod.LintStateOptions, 
    /* codeMirror */ typingsSlinky.codemirror.mod.Editor, 
    js.Array[typingsSlinky.codemirror.mod.Annotation] | js.Thenable[js.Array[typingsSlinky.codemirror.mod.Annotation]]
  ]
  type MimeModeMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * A function that, given a CodeMirror configuration object and an optional mode configuration object, returns a mode object.
    */
  type ModeFactory[T] = js.Function2[
    /* config */ typingsSlinky.codemirror.mod.EditorConfiguration, 
    /* modeOptions */ js.UndefOr[js.Any], 
    typingsSlinky.codemirror.mod.Mode[T]
  ]
  type ModeMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.codemirror.mod.ModeFactory[js.Any]]
  /**
    * A function that, given an array of annotations, updates the CodeMirror linting GUI with those annotations
    */
  type UpdateLintingCallback = js.Function2[
    /* codeMirror */ typingsSlinky.codemirror.mod.Editor, 
    /* annotations */ js.Array[typingsSlinky.codemirror.mod.Annotation], 
    scala.Unit
  ]
}
