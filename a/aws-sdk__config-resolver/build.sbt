organization := "org.scalablytyped.slinky"
name := "aws-sdk__config-resolver"
version := "1.0.0-rc.7-1f017d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "aws-sdk__node-config-provider" % "1.0.0-rc.7-f8fd53",
  "org.scalablytyped.slinky" %%% "aws-sdk__shared-ini-file-loader" % "1.0.0-rc.3-1ba38f",
  "org.scalablytyped.slinky" %%% "aws-sdk__types" % "1.0.0-rc.7-3820f8",
  "org.scalablytyped.slinky" %%% "node" % "14.14-dt-20201119Z-f152d9",
  "org.scalablytyped.slinky" %%% "std" % "4.1-233b27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
