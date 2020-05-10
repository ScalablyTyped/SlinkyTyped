package typingsSlinky.classTransformer.classTransformOptionsMod

import typingsSlinky.classTransformer.classTransformerStrings.excludeAll
import typingsSlinky.classTransformer.classTransformerStrings.exposeAll
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassTransformOptions extends js.Object {
  /**
    * If set to true then class transformer will perform a circular check. (circular check is turned off by default)
    * This option is useful when you know for sure that your types might have a circular dependency.
    */
  var enableCircularCheck: js.UndefOr[Boolean] = js.native
  /**
    * If set to true then class transformer will try to convert properties implicitly to their target type based on their typing information.
    *
    * DEFAULT: `false`
    */
  var enableImplicitConversion: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if extraneous properties should be excluded from the value when converting a plain value to a class.
    */
  var excludeExtraneousValues: js.UndefOr[Boolean] = js.native
  /**
    * Excludes properties with the given prefixes. For example, if you mark your private properties with "_" and "__"
    * you can set this option's value to ["_", "__"] and all private properties will be skipped.
    * This works only for "exposeAll" strategy.
    */
  var excludePrefixes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Only properties with given groups gonna be transformed.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  /**
    * If set to true then class transformer will ignore all @Expose and @Exclude decorators and what inside them.
    * This option is useful if you want to kinda clone your object but do not apply decorators affects.
    */
  var ignoreDecorators: js.UndefOr[Boolean] = js.native
  /**
    * Exclusion strategy. By default exposeAll is used, which means that it will expose all properties are transformed
    * by default.
    */
  var strategy: js.UndefOr[excludeAll | exposeAll] = js.native
  /**
    * Target maps allows to set a Types of the transforming object without using @Type decorator.
    * This is useful when you are transforming external classes, or if you already have type metadata for
    * objects and you don't want to set it up again.
    */
  var targetMaps: js.UndefOr[js.Array[TargetMap]] = js.native
  /**
    * Only properties with "since" > version < "until" gonna be transformed.
    */
  var version: js.UndefOr[Double] = js.native
}

object ClassTransformOptions {
  @scala.inline
  def apply(): ClassTransformOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassTransformOptions]
  }
  @scala.inline
  implicit class ClassTransformOptionsOps[Self <: ClassTransformOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableCircularCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCircularCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCircularCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCircularCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableImplicitConversion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableImplicitConversion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableImplicitConversion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableImplicitConversion")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeExtraneousValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeExtraneousValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeExtraneousValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeExtraneousValues")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludePrefixes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludePrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludePrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludePrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreDecorators(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDecorators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreDecorators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreDecorators")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: excludeAll | exposeAll): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetMaps(value: js.Array[TargetMap]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetMaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetMaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetMaps")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

