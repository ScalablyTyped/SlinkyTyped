package typingsSlinky.quill

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EditorChangeHandler = js.Function4[
    typingsSlinky.quill.quillStrings.`text-change` | typingsSlinky.quill.quillStrings.`selection-change`, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any) | (/* range */ typingsSlinky.quill.mod.RangeStatic), 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* oldContents */ js.Any) | (/* oldRange */ typingsSlinky.quill.mod.RangeStatic), 
    /* source */ typingsSlinky.quill.mod.Sources, 
    js.Any
  ]
  type SelectionChangeHandler = js.Function3[
    /* range */ typingsSlinky.quill.mod.RangeStatic, 
    /* oldRange */ typingsSlinky.quill.mod.RangeStatic, 
    /* source */ typingsSlinky.quill.mod.Sources, 
    js.Any
  ]
  type StringMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  type TextChangeHandler = js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* oldContents */ js.Any, 
    /* source */ typingsSlinky.quill.mod.Sources, 
    js.Any
  ]
}
