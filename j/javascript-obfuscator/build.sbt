organization := "org.scalablytyped.slinky"
name := "javascript-obfuscator"
version := "0.18.4-e53634"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "chance" % "1.0-dt-20191003Z-e5de5d",
  "org.scalablytyped.slinky" %%% "estraverse" % "0.0-unknown-dt-20190322Z-c8acb7",
  "org.scalablytyped.slinky" %%% "estree" % "0.0-unknown-dt-20191119Z-98f4da",
  "org.scalablytyped.slinky" %%% "inversify" % "5.0.1-ec2f5c",
  "org.scalablytyped.slinky" %%% "node" % "12.12-dt-20191126Z-6a8cbf",
  "org.scalablytyped.slinky" %%% "std" % "3.7-cc3821")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        