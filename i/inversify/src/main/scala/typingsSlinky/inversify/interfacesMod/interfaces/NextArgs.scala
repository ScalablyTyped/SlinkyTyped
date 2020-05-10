package typingsSlinky.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextArgs extends js.Object {
  var avoidConstraints: Boolean = js.native
  var isMultiInject: Boolean = js.native
  var key: js.UndefOr[String | Double | js.Symbol] = js.native
  var serviceIdentifier: ServiceIdentifier[_] = js.native
  var targetType: TargetType = js.native
  var value: js.UndefOr[js.Any] = js.native
  def contextInterceptor(contexts: Context): Context = js.native
}

object NextArgs {
  @scala.inline
  def apply(
    avoidConstraints: Boolean,
    contextInterceptor: Context => Context,
    isMultiInject: Boolean,
    serviceIdentifier: ServiceIdentifier[_],
    targetType: TargetType
  ): NextArgs = {
    val __obj = js.Dynamic.literal(avoidConstraints = avoidConstraints.asInstanceOf[js.Any], contextInterceptor = js.Any.fromFunction1(contextInterceptor), isMultiInject = isMultiInject.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any], targetType = targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextArgs]
  }
  @scala.inline
  implicit class NextArgsOps[Self <: NextArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvoidConstraints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextInterceptor(value: Context => Context): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextInterceptor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsMultiInject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMultiInject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceIdentifier(value: ServiceIdentifier[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetType(value: TargetType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String | Double | js.Symbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

