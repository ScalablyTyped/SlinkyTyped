package typingsSlinky.classTransformer

import typingsSlinky.classTransformer.classTransformOptionsMod.ClassTransformOptions
import typingsSlinky.classTransformer.exposeExcludeOptionsMod.ExcludeOptions
import typingsSlinky.classTransformer.exposeExcludeOptionsMod.ExposeOptions
import typingsSlinky.classTransformer.exposeExcludeOptionsMod.TransformOptions
import typingsSlinky.classTransformer.exposeExcludeOptionsMod.TypeHelpOptions
import typingsSlinky.classTransformer.exposeExcludeOptionsMod.TypeOptions
import typingsSlinky.classTransformer.transformOperationExecutorMod.TransformationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("class-transformer/decorators", JSImport.Namespace)
@js.native
object decoratorsMod extends js.Object {
  
  def Exclude(): js.Function2[/* object */ js.Object | js.Function, /* propertyName */ js.UndefOr[String], Unit] = js.native
  def Exclude(options: ExcludeOptions): js.Function2[/* object */ js.Object | js.Function, /* propertyName */ js.UndefOr[String], Unit] = js.native
  
  def Expose(): js.Function2[/* object */ js.Object | js.Function, /* propertyName */ js.UndefOr[String], Unit] = js.native
  def Expose(options: ExposeOptions): js.Function2[/* object */ js.Object | js.Function, /* propertyName */ js.UndefOr[String], Unit] = js.native
  
  def Transform(
    transformFn: js.Function3[/* value */ js.Any, /* obj */ js.Any, /* transformationType */ TransformationType, _]
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  def Transform(
    transformFn: js.Function3[/* value */ js.Any, /* obj */ js.Any, /* transformationType */ TransformationType, _],
    options: TransformOptions
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  
  def TransformClassToClass(): js.Function = js.native
  def TransformClassToClass(params: ClassTransformOptions): js.Function = js.native
  
  def TransformClassToPlain(): js.Function = js.native
  def TransformClassToPlain(params: ClassTransformOptions): js.Function = js.native
  
  def TransformPlainToClass(classType: js.Any): js.Function = js.native
  def TransformPlainToClass(classType: js.Any, params: ClassTransformOptions): js.Function = js.native
  
  def Type(): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  def Type(typeFunction: js.UndefOr[scala.Nothing], options: TypeOptions): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  def Type(typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function]): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
  def Type(
    typeFunction: js.Function1[/* type */ js.UndefOr[TypeHelpOptions], js.Function],
    options: TypeOptions
  ): js.Function2[/* target */ js.Any, /* key */ String, Unit] = js.native
}
