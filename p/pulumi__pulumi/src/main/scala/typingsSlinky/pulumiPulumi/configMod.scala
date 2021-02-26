package typingsSlinky.pulumiPulumi

import typingsSlinky.pulumiPulumi.outputMod.Output_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("@pulumi/pulumi/config", "Config")
  @js.native
  class Config () extends StObject {
    def this(name: String) = this()
    
    /**
      * fullKey turns a simple configuration key into a fully resolved one, by prepending the bag's name.
      *
      * @param key The key to lookup.
      */
    var fullKey: js.Any = js.native
    
    /**
      * get loads an optional configuration value by its key, or undefined if it doesn't exist.
      *
      * @param key The key to lookup.
      * @param opts An options bag to constrain legal values.
      */
    def get[K /* <: String */](key: String): js.UndefOr[K] = js.native
    def get[K /* <: String */](key: String, opts: StringConfigOptions[K]): js.UndefOr[K] = js.native
    
    /**
      * getBoolean loads an optional configuration value, as a boolean, by its key, or undefined if it doesn't exist.
      * If the configuration value isn't a legal boolean, this function will throw an error.
      *
      * @param key The key to lookup.
      */
    def getBoolean(key: String): js.UndefOr[Boolean] = js.native
    
    /**
      * getNumber loads an optional configuration value, as a number, by its key, or undefined if it doesn't exist.
      * If the configuration value isn't a legal number, this function will throw an error.
      *
      * @param key The key to lookup.
      * @param opts An options bag to constrain legal values.
      */
    def getNumber(key: String): js.UndefOr[Double] = js.native
    def getNumber(key: String, opts: NumberConfigOptions): js.UndefOr[Double] = js.native
    
    /**
      * getObject loads an optional configuration value, as an object, by its key, or undefined if it doesn't exist.
      * This routine simply JSON parses and doesn't validate the shape of the contents.
      *
      * @param key The key to lookup.
      */
    def getObject[T](key: String): js.UndefOr[T] = js.native
    
    /**
      * getSecret loads an optional configuration value by its key, marking it as a secret, or undefined if it
      * doesn't exist.
      *
      * @param key The key to lookup.
      * @param opts An options bag to constrain legal values.
      */
    def getSecret[K /* <: String */](key: String): js.UndefOr[Output_[K]] = js.native
    def getSecret[K /* <: String */](key: String, opts: StringConfigOptions[K]): js.UndefOr[Output_[K]] = js.native
    
    /**
      * getSecretBoolean loads an optional configuration value, as a boolean, by its key, making it as a secret
      * or undefined if it doesn't exist. If the configuration value isn't a legal boolean, this function will
      * throw an error.
      *
      * @param key The key to lookup.
      */
    def getSecretBoolean(key: String): js.UndefOr[Output_[Boolean]] = js.native
    
    /**
      * getSecretNumber loads an optional configuration value, as a number, by its key, marking it as a secret
      * or undefined if it doesn't exist.
      * If the configuration value isn't a legal number, this function will throw an error.
      *
      * @param key The key to lookup.
      * @param opts An options bag to constrain legal values.
      */
    def getSecretNumber(key: String): js.UndefOr[Output_[Double]] = js.native
    def getSecretNumber(key: String, opts: NumberConfigOptions): js.UndefOr[Output_[Double]] = js.native
    
    /**
      * getSecretObject loads an optional configuration value, as an object, by its key, marking it as a secret
      * or undefined if it doesn't exist.
      * This routine simply JSON parses and doesn't validate the shape of the contents.
      *
      * @param key The key to lookup.
      */
    def getSecretObject[T](key: String): js.UndefOr[Output_[T]] = js.native
    
    /**
      * name is the configuration bag's logical name and uniquely identifies it.  The default is the name of the current
      * project.
      */
    val name: String = js.native
    
    /**
      * require loads a configuration value by its given key.  If it doesn't exist, an error is thrown.
      *
      * @param key The key to lookup.
      * @param opts An options bag to constrain legal values.
      */
    def require[K /* <: String */](key: String): K = js.native
    def require[K /* <: String */](key: String, opts: StringConfigOptions[K]): K = js.native
    
    /**
      * requireBoolean loads a configuration value, as a boolean, by its given key.  If it doesn't exist, or the
      * configuration value is not a legal boolean, an error is thrown.
      *
      * @param key The key to lookup.
      */
    def requireBoolean(key: String): Boolean = js.native
    
    /**
      * requireNumber loads a configuration value, as a number, by its given key.  If it doesn't exist, or the
      * configuration value is not a legal number, an error is thrown.
      *
      * @param key The key to lookup.
      * @param opts An options bag to constrain legal values.
      */
    def requireNumber(key: String): Double = js.native
    def requireNumber(key: String, opts: NumberConfigOptions): Double = js.native
    
    /**
      * requireObject loads a configuration value as a JSON string and deserializes the JSON into a JavaScript object. If
      * it doesn't exist, or the configuration value is not a legal JSON string, an error is thrown.
      *
      * @param key The key to lookup.
      */
    def requireObject[T](key: String): T = js.native
    
    /**
      * require loads a configuration value by its given key, marking it as a secet.  If it doesn't exist, an error
      * is thrown.
      *
      * @param key The key to lookup.
      * @param opts An options bag to constrain legal values.
      */
    def requireSecret[K /* <: String */](key: String): Output_[K] = js.native
    def requireSecret[K /* <: String */](key: String, opts: StringConfigOptions[K]): Output_[K] = js.native
    
    /**
      * requireSecretBoolean loads a configuration value, as a boolean, by its given key, marking it as a secret.
      * If it doesn't exist, or the configuration value is not a legal boolean, an error is thrown.
      *
      * @param key The key to lookup.
      */
    def requireSecretBoolean(key: String): Output_[Boolean] = js.native
    
    /**
      * requireSecretNumber loads a configuration value, as a number, by its given key, marking it as a secret.
      * If it doesn't exist, or the configuration value is not a legal number, an error is thrown.
      *
      * @param key The key to lookup.
      * @param opts An options bag to constrain legal values.
      */
    def requireSecretNumber(key: String): Output_[Double] = js.native
    def requireSecretNumber(key: String, opts: NumberConfigOptions): Output_[Double] = js.native
    
    /**
      * requireSecretObject loads a configuration value as a JSON string and deserializes the JSON into a JavaScript
      * object, marking it as a secret. If it doesn't exist, or the configuration value is not a legal JSON
      * string, an error is thrown.
      *
      * @param key The key to lookup.
      */
    def requireSecretObject[T](key: String): Output_[T] = js.native
  }
  
  @js.native
  trait NumberConfigOptions extends StObject {
    
    /**
      * The maximum number value, inclusive. If the number is greater than this, a ConfigRangeError is thrown.
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * The minimum number value, inclusive. If the number is less than this, a ConfigRangeError is thrown.
      */
    var min: js.UndefOr[Double] = js.native
  }
  object NumberConfigOptions {
    
    @scala.inline
    def apply(): NumberConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberConfigOptions]
    }
    
    @scala.inline
    implicit class NumberConfigOptionsMutableBuilder[Self <: NumberConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  @js.native
  trait StringConfigOptions[K /* <: String */] extends StObject {
    
    /**
      * The legal enum values. If it does not match, a ConfigEnumError is thrown.
      */
    var allowedValues: js.UndefOr[js.Array[K]] = js.native
    
    /**
      * The maximum string length. If the string is longer than this, a ConfigRangeError is thrown.
      */
    var maxLength: js.UndefOr[Double] = js.native
    
    /**
      * The minimum string length. If the string is not this long, a ConfigRangeError is thrown.
      */
    var minLength: js.UndefOr[Double] = js.native
    
    /**
      * A regular expression the string must match. If it does not match, a ConfigPatternError is thrown.
      */
    var pattern: js.UndefOr[String | js.RegExp] = js.native
  }
  object StringConfigOptions {
    
    @scala.inline
    def apply[K /* <: String */](): StringConfigOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringConfigOptions[K]]
    }
    
    @scala.inline
    implicit class StringConfigOptionsMutableBuilder[Self <: StringConfigOptions[_], K /* <: String */] (val x: Self with StringConfigOptions[K]) extends AnyVal {
      
      @scala.inline
      def setAllowedValues(value: js.Array[K]): Self = StObject.set(x, "allowedValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedValuesUndefined: Self = StObject.set(x, "allowedValues", js.undefined)
      
      @scala.inline
      def setAllowedValuesVarargs(value: K*): Self = StObject.set(x, "allowedValues", js.Array(value :_*))
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setPattern(value: String | js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternRegExp(value: js.RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    }
  }
}
