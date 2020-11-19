package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object opsworksMod {
  
  type AgentVersions = js.Array[typingsSlinky.awsSdk.opsworksMod.AgentVersion]
  
  type AppAttributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.opsworksMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DocumentRoot
    - typingsSlinky.awsSdk.awsSdkStrings.RailsEnv
    - typingsSlinky.awsSdk.awsSdkStrings.AutoBundleOnDeploy
    - typingsSlinky.awsSdk.awsSdkStrings.AwsFlowRubySettings
    - java.lang.String
  */
  type AppAttributesKeys = typingsSlinky.awsSdk.opsworksMod._AppAttributesKeys | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`aws-flow-ruby`
    - typingsSlinky.awsSdk.awsSdkStrings.java_
    - typingsSlinky.awsSdk.awsSdkStrings.rails
    - typingsSlinky.awsSdk.awsSdkStrings.php_
    - typingsSlinky.awsSdk.awsSdkStrings.nodejs
    - typingsSlinky.awsSdk.awsSdkStrings.static__
    - typingsSlinky.awsSdk.awsSdkStrings.other_
    - java.lang.String
  */
  type AppType = typingsSlinky.awsSdk.opsworksMod._AppType | java.lang.String
  
  type Apps = js.Array[typingsSlinky.awsSdk.opsworksMod.App]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.x86_64_
    - typingsSlinky.awsSdk.awsSdkStrings.i386
    - java.lang.String
  */
  type Architecture = typingsSlinky.awsSdk.opsworksMod._Architecture | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.load
    - typingsSlinky.awsSdk.awsSdkStrings.timer
    - java.lang.String
  */
  type AutoScalingType = typingsSlinky.awsSdk.opsworksMod._AutoScalingType | java.lang.String
  
  type BlockDeviceMappings = js.Array[typingsSlinky.awsSdk.opsworksMod.BlockDeviceMapping]
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.opsworksMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ascii
    - typingsSlinky.awsSdk.awsSdkStrings.big5
    - typingsSlinky.awsSdk.awsSdkStrings.big5hkscs
    - typingsSlinky.awsSdk.awsSdkStrings.cp037
    - typingsSlinky.awsSdk.awsSdkStrings.cp424
    - typingsSlinky.awsSdk.awsSdkStrings.cp437
    - typingsSlinky.awsSdk.awsSdkStrings.cp500
    - typingsSlinky.awsSdk.awsSdkStrings.cp720
    - typingsSlinky.awsSdk.awsSdkStrings.cp737
    - typingsSlinky.awsSdk.awsSdkStrings.cp775
    - typingsSlinky.awsSdk.awsSdkStrings.cp850
    - typingsSlinky.awsSdk.awsSdkStrings.cp852
    - typingsSlinky.awsSdk.awsSdkStrings.cp855
    - typingsSlinky.awsSdk.awsSdkStrings.cp856
    - typingsSlinky.awsSdk.awsSdkStrings.cp857
    - typingsSlinky.awsSdk.awsSdkStrings.cp858
    - typingsSlinky.awsSdk.awsSdkStrings.cp860
    - typingsSlinky.awsSdk.awsSdkStrings.cp861
    - typingsSlinky.awsSdk.awsSdkStrings.cp862
    - typingsSlinky.awsSdk.awsSdkStrings.cp863
    - typingsSlinky.awsSdk.awsSdkStrings.cp864
    - typingsSlinky.awsSdk.awsSdkStrings.cp865
    - typingsSlinky.awsSdk.awsSdkStrings.cp866
    - typingsSlinky.awsSdk.awsSdkStrings.cp869
    - typingsSlinky.awsSdk.awsSdkStrings.cp874
    - typingsSlinky.awsSdk.awsSdkStrings.cp875
    - typingsSlinky.awsSdk.awsSdkStrings.cp932
    - typingsSlinky.awsSdk.awsSdkStrings.cp949
    - typingsSlinky.awsSdk.awsSdkStrings.cp950
    - typingsSlinky.awsSdk.awsSdkStrings.cp1006
    - typingsSlinky.awsSdk.awsSdkStrings.cp1026
    - typingsSlinky.awsSdk.awsSdkStrings.cp1140
    - typingsSlinky.awsSdk.awsSdkStrings.cp1250
    - typingsSlinky.awsSdk.awsSdkStrings.cp1251
    - typingsSlinky.awsSdk.awsSdkStrings.cp1252
    - typingsSlinky.awsSdk.awsSdkStrings.cp1253
    - typingsSlinky.awsSdk.awsSdkStrings.cp1254
    - typingsSlinky.awsSdk.awsSdkStrings.cp1255
    - typingsSlinky.awsSdk.awsSdkStrings.cp1256
    - typingsSlinky.awsSdk.awsSdkStrings.cp1257
    - typingsSlinky.awsSdk.awsSdkStrings.cp1258
    - typingsSlinky.awsSdk.awsSdkStrings.euc_jp
    - typingsSlinky.awsSdk.awsSdkStrings.euc_jis_2004
    - typingsSlinky.awsSdk.awsSdkStrings.euc_jisx0213
    - typingsSlinky.awsSdk.awsSdkStrings.euc_kr
    - typingsSlinky.awsSdk.awsSdkStrings.gb2312
    - typingsSlinky.awsSdk.awsSdkStrings.gbk
    - typingsSlinky.awsSdk.awsSdkStrings.gb18030
    - typingsSlinky.awsSdk.awsSdkStrings.hz
    - typingsSlinky.awsSdk.awsSdkStrings.iso2022_jp
    - typingsSlinky.awsSdk.awsSdkStrings.iso2022_jp_1
    - typingsSlinky.awsSdk.awsSdkStrings.iso2022_jp_2
    - typingsSlinky.awsSdk.awsSdkStrings.iso2022_jp_2004
    - typingsSlinky.awsSdk.awsSdkStrings.iso2022_jp_3
    - typingsSlinky.awsSdk.awsSdkStrings.iso2022_jp_ext
    - typingsSlinky.awsSdk.awsSdkStrings.iso2022_kr
    - typingsSlinky.awsSdk.awsSdkStrings.latin_1
    - typingsSlinky.awsSdk.awsSdkStrings.iso8859_2
    - typingsSlinky.awsSdk.awsSdkStrings.iso8859_3
    - typingsSlinky.awsSdk.awsSdkStrings.iso8859_4
    - typingsSlinky.awsSdk.awsSdkStrings.iso8859_5
    - typingsSlinky.awsSdk.awsSdkStrings.iso8859_6
    - typingsSlinky.awsSdk.awsSdkStrings.iso8859_7
    - typingsSlinky.awsSdk.awsSdkStrings.iso8859_8
    - typingsSlinky.awsSdk.awsSdkStrings.iso8859_9
    - typingsSlinky.awsSdk.awsSdkStrings.iso8859_10
    - typingsSlinky.awsSdk.awsSdkStrings.iso8859_13
    - typingsSlinky.awsSdk.awsSdkStrings.iso8859_14
    - typingsSlinky.awsSdk.awsSdkStrings.iso8859_15
    - typingsSlinky.awsSdk.awsSdkStrings.iso8859_16
    - typingsSlinky.awsSdk.awsSdkStrings.johab
    - typingsSlinky.awsSdk.awsSdkStrings.koi8_r
    - typingsSlinky.awsSdk.awsSdkStrings.koi8_u
    - typingsSlinky.awsSdk.awsSdkStrings.mac_cyrillic
    - typingsSlinky.awsSdk.awsSdkStrings.mac_greek
    - typingsSlinky.awsSdk.awsSdkStrings.mac_iceland
    - typingsSlinky.awsSdk.awsSdkStrings.mac_latin2
    - typingsSlinky.awsSdk.awsSdkStrings.mac_roman
    - typingsSlinky.awsSdk.awsSdkStrings.mac_turkish
    - typingsSlinky.awsSdk.awsSdkStrings.ptcp154
    - typingsSlinky.awsSdk.awsSdkStrings.shift_jis
    - typingsSlinky.awsSdk.awsSdkStrings.shift_jis_2004
    - typingsSlinky.awsSdk.awsSdkStrings.shift_jisx0213
    - typingsSlinky.awsSdk.awsSdkStrings.utf_32
    - typingsSlinky.awsSdk.awsSdkStrings.utf_32_be
    - typingsSlinky.awsSdk.awsSdkStrings.utf_32_le
    - typingsSlinky.awsSdk.awsSdkStrings.utf_16
    - typingsSlinky.awsSdk.awsSdkStrings.utf_16_be
    - typingsSlinky.awsSdk.awsSdkStrings.utf_16_le
    - typingsSlinky.awsSdk.awsSdkStrings.utf_7
    - typingsSlinky.awsSdk.awsSdkStrings.utf_8
    - typingsSlinky.awsSdk.awsSdkStrings.utf_8_sig
    - java.lang.String
  */
  type CloudWatchLogsEncoding = typingsSlinky.awsSdk.opsworksMod._CloudWatchLogsEncoding | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.start_of_file
    - typingsSlinky.awsSdk.awsSdkStrings.end_of_file
    - java.lang.String
  */
  type CloudWatchLogsInitialPosition = typingsSlinky.awsSdk.opsworksMod._CloudWatchLogsInitialPosition | java.lang.String
  
  type CloudWatchLogsLogStreams = js.Array[typingsSlinky.awsSdk.opsworksMod.CloudWatchLogsLogStream]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.LOCAL
    - typingsSlinky.awsSdk.awsSdkStrings.UTC
    - java.lang.String
  */
  type CloudWatchLogsTimeZone = typingsSlinky.awsSdk.opsworksMod._CloudWatchLogsTimeZone | java.lang.String
  
  type Commands = js.Array[typingsSlinky.awsSdk.opsworksMod.Command]
  
  type DailyAutoScalingSchedule = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.opsworksMod.Switch]
  
  type DataSources = js.Array[typingsSlinky.awsSdk.opsworksMod.DataSource]
  
  type DateTime = java.lang.String
  
  type DeploymentCommandArgs = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.opsworksMod.Strings]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.install_dependencies
    - typingsSlinky.awsSdk.awsSdkStrings.update_dependencies
    - typingsSlinky.awsSdk.awsSdkStrings.update_custom_cookbooks
    - typingsSlinky.awsSdk.awsSdkStrings.execute_recipes
    - typingsSlinky.awsSdk.awsSdkStrings.configure
    - typingsSlinky.awsSdk.awsSdkStrings.setup_
    - typingsSlinky.awsSdk.awsSdkStrings.deploy_
    - typingsSlinky.awsSdk.awsSdkStrings.rollback_
    - typingsSlinky.awsSdk.awsSdkStrings.start_
    - typingsSlinky.awsSdk.awsSdkStrings.stop
    - typingsSlinky.awsSdk.awsSdkStrings.restart
    - typingsSlinky.awsSdk.awsSdkStrings.undeploy
    - java.lang.String
  */
  type DeploymentCommandName = typingsSlinky.awsSdk.opsworksMod._DeploymentCommandName | java.lang.String
  
  type Deployments = js.Array[typingsSlinky.awsSdk.opsworksMod.Deployment]
  
  type Double = scala.Double
  
  type EcsClusters = js.Array[typingsSlinky.awsSdk.opsworksMod.EcsCluster]
  
  type ElasticIps = js.Array[typingsSlinky.awsSdk.opsworksMod.ElasticIp]
  
  type ElasticLoadBalancers = js.Array[typingsSlinky.awsSdk.opsworksMod.ElasticLoadBalancer]
  
  type EnvironmentVariables = js.Array[typingsSlinky.awsSdk.opsworksMod.EnvironmentVariable]
  
  type Hour = java.lang.String
  
  type Instances = js.Array[typingsSlinky.awsSdk.opsworksMod.Instance]
  
  type Integer = scala.Double
  
  type LayerAttributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.opsworksMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EcsClusterArn
    - typingsSlinky.awsSdk.awsSdkStrings.EnableHaproxyStats
    - typingsSlinky.awsSdk.awsSdkStrings.HaproxyStatsUrl
    - typingsSlinky.awsSdk.awsSdkStrings.HaproxyStatsUser
    - typingsSlinky.awsSdk.awsSdkStrings.HaproxyStatsPassword
    - typingsSlinky.awsSdk.awsSdkStrings.HaproxyHealthCheckUrl
    - typingsSlinky.awsSdk.awsSdkStrings.HaproxyHealthCheckMethod
    - typingsSlinky.awsSdk.awsSdkStrings.MysqlRootPassword
    - typingsSlinky.awsSdk.awsSdkStrings.MysqlRootPasswordUbiquitous
    - typingsSlinky.awsSdk.awsSdkStrings.GangliaUrl
    - typingsSlinky.awsSdk.awsSdkStrings.GangliaUser
    - typingsSlinky.awsSdk.awsSdkStrings.GangliaPassword
    - typingsSlinky.awsSdk.awsSdkStrings.MemcachedMemory
    - typingsSlinky.awsSdk.awsSdkStrings.NodejsVersion
    - typingsSlinky.awsSdk.awsSdkStrings.RubyVersion
    - typingsSlinky.awsSdk.awsSdkStrings.RubygemsVersion
    - typingsSlinky.awsSdk.awsSdkStrings.ManageBundler
    - typingsSlinky.awsSdk.awsSdkStrings.BundlerVersion
    - typingsSlinky.awsSdk.awsSdkStrings.RailsStack
    - typingsSlinky.awsSdk.awsSdkStrings.PassengerVersion
    - typingsSlinky.awsSdk.awsSdkStrings.Jvm
    - typingsSlinky.awsSdk.awsSdkStrings.JvmVersion
    - typingsSlinky.awsSdk.awsSdkStrings.JvmOptions
    - typingsSlinky.awsSdk.awsSdkStrings.JavaAppServer
    - typingsSlinky.awsSdk.awsSdkStrings.JavaAppServerVersion
    - java.lang.String
  */
  type LayerAttributesKeys = typingsSlinky.awsSdk.opsworksMod._LayerAttributesKeys | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`aws-flow-ruby`
    - typingsSlinky.awsSdk.awsSdkStrings.`ecs-cluster`
    - typingsSlinky.awsSdk.awsSdkStrings.`java-app`
    - typingsSlinky.awsSdk.awsSdkStrings.lb_
    - typingsSlinky.awsSdk.awsSdkStrings.web_
    - typingsSlinky.awsSdk.awsSdkStrings.`php-app`
    - typingsSlinky.awsSdk.awsSdkStrings.`rails-app`
    - typingsSlinky.awsSdk.awsSdkStrings.`nodejs-app`
    - typingsSlinky.awsSdk.awsSdkStrings.memcached
    - typingsSlinky.awsSdk.awsSdkStrings.`db-master`
    - typingsSlinky.awsSdk.awsSdkStrings.`monitoring-master`
    - typingsSlinky.awsSdk.awsSdkStrings.custom__
    - java.lang.String
  */
  type LayerType = typingsSlinky.awsSdk.opsworksMod._LayerType | java.lang.String
  
  type Layers = js.Array[typingsSlinky.awsSdk.opsworksMod.Layer]
  
  type LoadBasedAutoScalingConfigurations = js.Array[typingsSlinky.awsSdk.opsworksMod.LoadBasedAutoScalingConfiguration]
  
  type MaxResults = scala.Double
  
  type Minute = scala.Double
  
  type NextToken = java.lang.String
  
  type OperatingSystemConfigurationManagers = js.Array[typingsSlinky.awsSdk.opsworksMod.OperatingSystemConfigurationManager]
  
  type OperatingSystems = js.Array[typingsSlinky.awsSdk.opsworksMod.OperatingSystem]
  
  type Parameters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.opsworksMod.String]
  
  type Permissions = js.Array[typingsSlinky.awsSdk.opsworksMod.Permission]
  
  type RaidArrays = js.Array[typingsSlinky.awsSdk.opsworksMod.RaidArray]
  
  type RdsDbInstances = js.Array[typingsSlinky.awsSdk.opsworksMod.RdsDbInstance]
  
  type ResourceArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ebs_
    - typingsSlinky.awsSdk.awsSdkStrings.`instance-store`
    - java.lang.String
  */
  type RootDeviceType = typingsSlinky.awsSdk.opsworksMod._RootDeviceType | java.lang.String
  
  type ServiceErrors = js.Array[typingsSlinky.awsSdk.opsworksMod.ServiceError]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.git_
    - typingsSlinky.awsSdk.awsSdkStrings.svn
    - typingsSlinky.awsSdk.awsSdkStrings.archive_
    - typingsSlinky.awsSdk.awsSdkStrings.s3_
    - java.lang.String
  */
  type SourceType = typingsSlinky.awsSdk.opsworksMod._SourceType | java.lang.String
  
  type StackAttributes = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.opsworksMod.String]
  
  type StackAttributesKeys = typingsSlinky.awsSdk.awsSdkStrings.Color_ | java.lang.String
  
  type Stacks = js.Array[typingsSlinky.awsSdk.opsworksMod.Stack]
  
  type String = java.lang.String
  
  type Strings = js.Array[typingsSlinky.awsSdk.opsworksMod.String]
  
  type Switch = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typingsSlinky.awsSdk.opsworksMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.opsworksMod.TagValue]
  
  type TimeBasedAutoScalingConfigurations = js.Array[typingsSlinky.awsSdk.opsworksMod.TimeBasedAutoScalingConfiguration]
  
  type UserProfiles = js.Array[typingsSlinky.awsSdk.opsworksMod.UserProfile]
  
  type ValidForInMinutes = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.paravirtual
    - typingsSlinky.awsSdk.awsSdkStrings.hvm
    - java.lang.String
  */
  type VirtualizationType = typingsSlinky.awsSdk.opsworksMod._VirtualizationType | java.lang.String
  
  type VolumeConfigurations = js.Array[typingsSlinky.awsSdk.opsworksMod.VolumeConfiguration]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.gp2
    - typingsSlinky.awsSdk.awsSdkStrings.io1
    - typingsSlinky.awsSdk.awsSdkStrings.standard__
    - java.lang.String
  */
  type VolumeType = typingsSlinky.awsSdk.opsworksMod._VolumeType | java.lang.String
  
  type Volumes = js.Array[typingsSlinky.awsSdk.opsworksMod.Volume]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2013-02-18`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.opsworksMod._apiVersion | java.lang.String
}
