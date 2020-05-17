package typingsSlinky.reduxSagaCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object effectsMod {
  type ActionChannelEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'ACTION_CHANNEL', ActionChannelEffectDescriptor> */ js.Any
  type AllButLast[L /* <: js.Array[_] */] = typingsSlinky.typescriptTuple.libMod.Reverse[
    typingsSlinky.reduxSagaCore.effectsMod.Tail[typingsSlinky.typescriptTuple.libMod.Reverse[L]]
  ]
  type AllEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffect<'ALL', T> */ js.Any
  type AllEffectDescriptor[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffectDescriptor<T> */ js.Any
  type CallEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CALL', CallEffectDescriptor> */ js.Any
  type CancelEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CANCEL', CancelEffectDescriptor> */ js.Any
  type CancelledEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CANCELLED', CancelledEffectDescriptor> */ js.Any
  type CancelledEffectDescriptor = js.Object
  type ChannelPutEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'PUT', ChannelPutEffectDescriptor<T>> */ js.Any
  type ChannelTakeEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'TAKE', ChannelTakeEffectDescriptor<T>> */ js.Any
  type CpsEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'CPS', CallEffectDescriptor> */ js.Any
  type CpsFunctionParameters[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = typingsSlinky.reduxSagaCore.effectsMod.AllButLast[typingsSlinky.std.Parameters[Fn]]
  type FlushEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'FLUSH', FlushEffectDescriptor<T>> */ js.Any
  type FlushEffectDescriptor[T] = typingsSlinky.reduxSagaCore.typesMod.FlushableChannel[T]
  type ForkEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'FORK', ForkEffectDescriptor> */ js.Any
  type GetContextEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'GET_CONTEXT', GetContextEffectDescriptor> */ js.Any
  type GetContextEffectDescriptor = java.lang.String
  type JoinEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'JOIN', JoinEffectDescriptor> */ js.Any
  type PutEffect[A /* <: typingsSlinky.redux.mod.Action[_] */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'PUT', PutEffectDescriptor<A>> */ js.Any
  type RaceEffect[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffect<'RACE', T> */ js.Any
  type RaceEffectDescriptor[T] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CombinatorEffectDescriptor<T> */ js.Any
  type SELF_CANCELLATION = typingsSlinky.reduxSagaCore.reduxSagaCoreStrings.`@@redux-sagaSlashSELF_CANCELLATION`
  type SelectEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'SELECT', SelectEffectDescriptor> */ js.Any
  type SetContextEffect[C /* <: js.Object */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'SET_CONTEXT', SetContextEffectDescriptor<C>> */ js.Any
  type SetContextEffectDescriptor[C /* <: js.Object */] = C
  type Tail[L /* <: js.Array[_] */] = js.Any
  type TakeEffect = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SimpleEffect<'TAKE', TakeEffectDescriptor> */ js.Any
}
