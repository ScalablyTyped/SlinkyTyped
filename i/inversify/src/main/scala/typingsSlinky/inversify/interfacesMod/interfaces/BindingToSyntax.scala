package typingsSlinky.inversify.interfacesMod.interfaces

import typingsSlinky.inversify.anon.Instantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingToSyntax[T] extends js.Object {
  def to(constructor: Instantiable[T]): BindingInWhenOnSyntax[T] = js.native
  def toAutoFactory[T2](serviceIdentifier: ServiceIdentifier[T2]): BindingWhenOnSyntax[T] = js.native
  def toConstantValue(value: T): BindingWhenOnSyntax[T] = js.native
  def toConstructor[T2](constructor: Newable[T2]): BindingWhenOnSyntax[T] = js.native
  def toDynamicValue(func: js.Function1[/* context */ Context, T]): BindingInWhenOnSyntax[T] = js.native
  def toFactory[T2](factory: FactoryCreator[T2]): BindingWhenOnSyntax[T] = js.native
  def toFunction(func: T): BindingWhenOnSyntax[T] = js.native
  def toProvider[T2](provider: ProviderCreator[T2]): BindingWhenOnSyntax[T] = js.native
  def toSelf(): BindingInWhenOnSyntax[T] = js.native
  def toService(service: ServiceIdentifier[T]): Unit = js.native
}

object BindingToSyntax {
  @scala.inline
  def apply[T](
    to: Instantiable[T] => BindingInWhenOnSyntax[T],
    toAutoFactory: ServiceIdentifier[js.Any] => BindingWhenOnSyntax[T],
    toConstantValue: T => BindingWhenOnSyntax[T],
    toConstructor: Newable[js.Any] => BindingWhenOnSyntax[T],
    toDynamicValue: js.Function1[/* context */ Context, T] => BindingInWhenOnSyntax[T],
    toFactory: FactoryCreator[js.Any] => BindingWhenOnSyntax[T],
    toFunction: T => BindingWhenOnSyntax[T],
    toProvider: ProviderCreator[js.Any] => BindingWhenOnSyntax[T],
    toSelf: () => BindingInWhenOnSyntax[T],
    toService: ServiceIdentifier[T] => Unit
  ): BindingToSyntax[T] = {
    val __obj = js.Dynamic.literal(to = js.Any.fromFunction1(to), toAutoFactory = js.Any.fromFunction1(toAutoFactory), toConstantValue = js.Any.fromFunction1(toConstantValue), toConstructor = js.Any.fromFunction1(toConstructor), toDynamicValue = js.Any.fromFunction1(toDynamicValue), toFactory = js.Any.fromFunction1(toFactory), toFunction = js.Any.fromFunction1(toFunction), toProvider = js.Any.fromFunction1(toProvider), toSelf = js.Any.fromFunction0(toSelf), toService = js.Any.fromFunction1(toService))
    __obj.asInstanceOf[BindingToSyntax[T]]
  }
  @scala.inline
  implicit class BindingToSyntaxOps[Self[t] <: BindingToSyntax[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withTo(value: Instantiable[T] => BindingInWhenOnSyntax[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToAutoFactory(value: ServiceIdentifier[js.Any] => BindingWhenOnSyntax[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toAutoFactory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToConstantValue(value: T => BindingWhenOnSyntax[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toConstantValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToConstructor(value: Newable[js.Any] => BindingWhenOnSyntax[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toConstructor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToDynamicValue(value: js.Function1[/* context */ Context, T] => BindingInWhenOnSyntax[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDynamicValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToFactory(value: FactoryCreator[js.Any] => BindingWhenOnSyntax[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFactory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToFunction(value: T => BindingWhenOnSyntax[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToProvider(value: ProviderCreator[js.Any] => BindingWhenOnSyntax[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toProvider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToSelf(value: () => BindingInWhenOnSyntax[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSelf")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToService(value: ServiceIdentifier[T] => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toService")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

