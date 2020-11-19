organization := "org.scalablytyped.slinky"
name := "aws-sdk__credential-provider-cognito-identity"
version := "0.1.0-preview.2-fc29c2"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.6",
  "org.scalablytyped.slinky" %%% "aws-sdk__client-cognito-identity-browser" % "0.1.0-preview.2-082b97",
  "org.scalablytyped.slinky" %%% "aws-sdk__middleware-stack" % "0.1.0-preview.2-90aef7",
  "org.scalablytyped.slinky" %%% "aws-sdk__types" % "0.1.0-preview.1-9499ed",
  "org.scalablytyped.slinky" %%% "std" % "3.9-38a9bf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
