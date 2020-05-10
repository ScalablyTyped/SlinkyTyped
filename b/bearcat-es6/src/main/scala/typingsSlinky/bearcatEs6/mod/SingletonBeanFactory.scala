package typingsSlinky.bearcatEs6.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingletonBeanFactory extends js.Object {
  var beanFactory: BeanFactory = js.native
  var singletonObjects: js.Object = js.native
  /**
    * SingletonBeanFactory add singleton to SingletonBeanFactory.
    *
    * @param   beanName
    * @param   beanObject
    * @api     public
    */
  def addSingleton(beanName: String, beanObject: js.Object): Unit = js.native
  /**
    * SingletonBeanFactory check SingletonBeanFactory contains singleton or not.
    *
    * @param   beanName
    * @return  true | false
    * @api     public
    */
  def containsSingleton(beanName: String): Boolean = js.native
  /**
    * SingletonBeanFactory get singleton from SingletonBeanFactory.
    *
    * @param   beanName
    * @return  singletonObject
    * @api     public
    */
  def getSingleton(beanName: String): js.Object = js.native
  /**
    * SingletonBeanFactory get all singleton names from SingletonBeanFactory.
    *
    * @api     public
    */
  def getSingletonNames(): js.Array[String] = js.native
  /**
    * SingletonBeanFactory remove singleton from SingletonBeanFactory.
    *
    * @param   beanName
    * @api     public
    */
  def removeSingleton(beanName: String): Unit = js.native
}

object SingletonBeanFactory {
  @scala.inline
  def apply(
    addSingleton: (String, js.Object) => Unit,
    beanFactory: BeanFactory,
    containsSingleton: String => Boolean,
    getSingleton: String => js.Object,
    getSingletonNames: () => js.Array[String],
    removeSingleton: String => Unit,
    singletonObjects: js.Object
  ): SingletonBeanFactory = {
    val __obj = js.Dynamic.literal(addSingleton = js.Any.fromFunction2(addSingleton), beanFactory = beanFactory.asInstanceOf[js.Any], containsSingleton = js.Any.fromFunction1(containsSingleton), getSingleton = js.Any.fromFunction1(getSingleton), getSingletonNames = js.Any.fromFunction0(getSingletonNames), removeSingleton = js.Any.fromFunction1(removeSingleton), singletonObjects = singletonObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingletonBeanFactory]
  }
  @scala.inline
  implicit class SingletonBeanFactoryOps[Self <: SingletonBeanFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSingleton(value: (String, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSingleton")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBeanFactory(value: BeanFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beanFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainsSingleton(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containsSingleton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSingleton(value: String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSingleton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSingletonNames(value: () => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSingletonNames")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveSingleton(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSingleton")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSingletonObjects(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singletonObjects")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

