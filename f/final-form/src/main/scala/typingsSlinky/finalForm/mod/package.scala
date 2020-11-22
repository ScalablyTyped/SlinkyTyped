package typingsSlinky.finalForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AnyObject = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type ChangeValue[FormValues, InitialFormValues] = js.Function3[
    /* state */ typingsSlinky.finalForm.mod.MutableState[FormValues, InitialFormValues], 
    /* name */ java.lang.String, 
    /* mutate */ js.Function1[/* value */ js.Any, js.Any], 
    scala.Unit
  ]
  
  type DebugFunction[FormValues, InitialFormValues] = js.Function2[
    /* state */ typingsSlinky.finalForm.mod.FormState[FormValues, InitialFormValues], 
    /* fieldStates */ org.scalablytyped.runtime.StringDictionary[typingsSlinky.finalForm.mod.FieldState[js.Any]], 
    scala.Unit
  ]
  
  type Decorator[FormValues, InitialFormValues] = js.Function1[
    /* form */ typingsSlinky.finalForm.mod.FormApi[FormValues, InitialFormValues], 
    typingsSlinky.finalForm.mod.Unsubscribe
  ]
  
  type FieldSubscriber[FieldValue] = typingsSlinky.finalForm.mod.Subscriber[typingsSlinky.finalForm.mod.FieldState[FieldValue]]
  
  type FieldValidator[FieldValue] = js.Function3[
    /* value */ FieldValue, 
    /* allValues */ js.Object, 
    /* meta */ js.UndefOr[typingsSlinky.finalForm.mod.FieldState[FieldValue]], 
    js.Any | js.Promise[js.Any]
  ]
  
  type FormSubscriber[FormValues, InitialFormValues] = typingsSlinky.finalForm.mod.Subscriber[typingsSlinky.finalForm.mod.FormState[FormValues, InitialFormValues]]
  
  type GetFieldValidator[FieldValue] = js.Function0[js.UndefOr[typingsSlinky.finalForm.mod.FieldValidator[FieldValue]]]
  
  type GetIn_ = js.Function2[/* state */ js.Object, /* complexKey */ java.lang.String, js.Any]
  
  type IsEqual = js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean]
  
  type Mutator[FormValues, InitialFormValues] = js.Function3[
    /* args */ js.Any, 
    /* state */ typingsSlinky.finalForm.mod.MutableState[FormValues, InitialFormValues], 
    /* tools */ typingsSlinky.finalForm.mod.Tools[FormValues, InitialFormValues], 
    js.Any
  ]
  
  type RegisterField[FormValues] = js.Function4[
    /* keyof FormValues */ /* name */ java.lang.String, 
    /* subscriber */ typingsSlinky.finalForm.mod.FieldSubscriber[
      /* import warning: importer.ImportType#apply Failed type conversion: FormValues[keyof FormValues] */ js.Any
    ], 
    /* subscription */ typingsSlinky.finalForm.mod.FieldSubscription, 
    /* config */ js.UndefOr[
      typingsSlinky.finalForm.mod.FieldConfig[
        /* import warning: importer.ImportType#apply Failed type conversion: FormValues[keyof FormValues] */ js.Any
      ]
    ], 
    typingsSlinky.finalForm.mod.Unsubscribe
  ]
  
  type RenameField[FormValues, InitialFormValues] = js.Function3[
    /* state */ typingsSlinky.finalForm.mod.MutableState[FormValues, InitialFormValues], 
    /* from */ java.lang.String, 
    /* to */ java.lang.String, 
    scala.Unit
  ]
  
  type SetIn_ = js.Function3[/* state */ js.Object, /* key */ java.lang.String, /* value */ js.Any, js.Object]
  
  type SubmissionErrors = typingsSlinky.finalForm.mod.AnyObject
  
  type Subscriber[V] = js.Function1[/* value */ V, scala.Unit]
  
  type Subscription = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  type Unsubscribe = js.Function0[scala.Unit]
  
  type ValidationErrors = typingsSlinky.finalForm.mod.AnyObject
}
