package typingsSlinky.quill

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object quillMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.quill.Anon_Delete
  import typingsSlinky.quill.quillStrings.`selection-change`
  import typingsSlinky.quill.quillStrings.`text-change`

  type DeltaOperation = Anon_Delete with OptionalAttributes
  type EditorChangeHandler = js.Function4[
    `text-change` | `selection-change`, 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any) | (/* range */ RangeStatic), 
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* oldContents */ js.Any) | (/* oldRange */ RangeStatic), 
    /* source */ Sources, 
    js.Any
  ]
  type SelectionChangeHandler = js.Function3[/* range */ RangeStatic, /* oldRange */ RangeStatic, /* source */ Sources, js.Any]
  type StringMap = StringDictionary[js.Any]
  type TextChangeHandler = js.Function3[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* delta */ js.Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Delta */ /* oldContents */ js.Any, 
    /* source */ Sources, 
    js.Any
  ]
}
