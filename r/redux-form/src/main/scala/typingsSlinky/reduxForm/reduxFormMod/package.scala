package typingsSlinky.reduxForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object reduxFormMod {
  
  type ArrayInsertAction = js.Function3[/* field */ java.lang.String, /* index */ scala.Double, /* value */ js.Any, scala.Unit]
  
  type ArrayMoveAction = js.Function3[
    /* field */ java.lang.String, 
    /* from */ scala.Double, 
    /* to */ scala.Double, 
    scala.Unit
  ]
  
  type ArrayPopAction = js.Function1[/* field */ java.lang.String, scala.Unit]
  
  type ArrayPushAction = js.Function2[/* field */ java.lang.String, /* value */ js.Any, scala.Unit]
  
  type ArrayRemoveAction = js.Function2[/* field */ java.lang.String, /* index */ scala.Double, scala.Unit]
  
  type ArrayRemoveAllAction = js.Function1[/* field */ java.lang.String, scala.Unit]
  
  type ArrayShiftAction = js.Function1[/* field */ java.lang.String, scala.Unit]
  
  type ArraySpliceAction = js.Function4[
    /* field */ java.lang.String, 
    /* index */ scala.Double, 
    /* removeNum */ scala.Double, 
    /* value */ js.Any, 
    scala.Unit
  ]
  
  type ArraySwapAction = js.Function3[
    /* field */ java.lang.String, 
    /* indexA */ scala.Double, 
    /* indexB */ scala.Double, 
    scala.Unit
  ]
  
  type ArrayUnshiftAction = js.Function2[/* field */ java.lang.String, /* value */ js.Any, scala.Unit]
  
  type AutoFillAction = js.Function2[/* field */ java.lang.String, /* value */ js.Any, scala.Unit]
  
  type BlurAction = js.Function2[/* field */ java.lang.String, /* value */ js.Any, scala.Unit]
  
  type ChangeAction = js.Function2[/* field */ java.lang.String, /* value */ js.Any, scala.Unit]
  
  type ClearAsyncErrorAction = js.Function1[/* field */ java.lang.String, scala.Unit]
  
  type ClearFieldsAction = js.Function3[
    /* keepTouched */ scala.Boolean, 
    /* persistentSubmitErrors */ scala.Boolean, 
    /* repeated */ java.lang.String, 
    scala.Unit
  ]
  
  type ClearSubmitAction = js.Function0[scala.Unit]
  
  type ClearSubmitErrorsAction = js.Function0[scala.Unit]
  
  type DecoratedFormProps[FormData, P, ErrorType] = P with (typingsSlinky.std.Partial[typingsSlinky.reduxForm.reduxFormMod.ConfigProps[FormData, P, ErrorType]]) with (typingsSlinky.std.Partial[typingsSlinky.reduxForm.reduxFormMod.DecoratedFormState[FormData, ErrorType]]) with typingsSlinky.std.Partial[typingsSlinky.reduxForm.reduxFormMod.DecoratedFormActions[ErrorType]] with typingsSlinky.reduxForm.anon.ReduxForm
  
  type DestroyAction = js.Function0[scala.Unit]
  
  type FocusAction = js.Function1[/* field */ java.lang.String, scala.Unit]
  
  type FormDecorator[FormData, P, ErrorType] = js.Function1[
    /* component */ slinky.core.ReactComponentClass[
      P with (typingsSlinky.reduxForm.reduxFormMod.InjectedFormProps[FormData, P, ErrorType])
    ], 
    typingsSlinky.reduxForm.reduxFormMod.DecoratedComponentClass[
      FormData, 
      typingsSlinky.reduxForm.reduxFormMod.DecoratedFormProps[FormData, P, ErrorType]
    ]
  ]
  
  type FormSubmitHandler[FormData, P, ErrorType] = js.Function3[
    /* values */ FormData, 
    /* dispatch */ typingsSlinky.redux.mod.Dispatch[js.Any], 
    /* props */ typingsSlinky.reduxForm.reduxFormMod.DecoratedFormProps[FormData, P, ErrorType], 
    scala.Unit | (typingsSlinky.reduxForm.mod.FormErrors[FormData, ErrorType]) | js.Promise[js.Any]
  ]
  
  type GetFormState = js.Function1[/* state */ js.Any, typingsSlinky.reduxForm.reducerMod.FormStateMap]
  
  type InitializeAction[FormData] = js.Function3[
    /* initialValues */ typingsSlinky.std.Partial[FormData], 
    /* keepDirty */ scala.Boolean, 
    /* otherMeta */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  type RegisterFieldAction = js.Function2[
    /* name */ java.lang.String, 
    /* type */ typingsSlinky.reduxForm.mod.FieldType, 
    scala.Unit
  ]
  
  type ResetAction = js.Function0[scala.Unit]
  
  type ResetSectionAction = js.Function0[scala.Unit]
  
  type SetSubmitFailedAction = js.Function1[/* repeated */ java.lang.String, scala.Unit]
  
  type SetSubmitSucceededAction = js.Function1[/* repeated */ java.lang.String, scala.Unit]
  
  type StartAsyncValidationAction = js.Function1[/* field */ java.lang.String, scala.Unit]
  
  type StartSubmitAction = js.Function0[scala.Unit]
  
  type StopAsyncValidationAction[ErrorType] = js.Function1[
    /* errors */ js.UndefOr[typingsSlinky.reduxForm.mod.FormErrors[ErrorType, java.lang.String]], 
    scala.Unit
  ]
  
  type StopSubmitAction[ErrorType] = js.Function1[
    /* errors */ js.UndefOr[typingsSlinky.reduxForm.mod.FormErrors[ErrorType, java.lang.String]], 
    scala.Unit
  ]
  
  type SubmitAction = js.Function0[scala.Unit]
  
  type TouchAction = js.Function1[/* repeated */ java.lang.String, scala.Unit]
  
  type UnregisterFieldAction = js.Function2[
    /* name */ java.lang.String, 
    /* destroyOnUnmount */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  
  type UntouchAction = js.Function1[/* repeated */ java.lang.String, scala.Unit]
  
  type UpdateSyncErrorsAction[ErrorType] = js.Function2[
    /* syncErrors */ js.UndefOr[typingsSlinky.reduxForm.mod.FormErrors[ErrorType, java.lang.String]], 
    /* error */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  
  type UpdateSyncWarningsAction[ErrorType] = js.Function2[
    /* syncErrors */ js.UndefOr[typingsSlinky.reduxForm.mod.FormErrors[ErrorType, java.lang.String]], 
    /* error */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}
